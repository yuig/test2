package io.jsonwebtoken.impl;

import a.a;
import a.cb;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import io.jsonwebtoken.ClaimJwtException;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Clock;
import io.jsonwebtoken.CompressionCodec;
import io.jsonwebtoken.CompressionCodecResolver;
import io.jsonwebtoken.ExpiredJwtException;
import io.jsonwebtoken.Header;
import io.jsonwebtoken.IncorrectClaimException;
import io.jsonwebtoken.InvalidClaimException;
import io.jsonwebtoken.Jws;
import io.jsonwebtoken.JwsHeader;
import io.jsonwebtoken.Jwt;
import io.jsonwebtoken.JwtHandler;
import io.jsonwebtoken.JwtHandlerAdapter;
import io.jsonwebtoken.JwtParser;
import io.jsonwebtoken.MalformedJwtException;
import io.jsonwebtoken.MissingClaimException;
import io.jsonwebtoken.PrematureJwtException;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.SigningKeyResolver;
import io.jsonwebtoken.UnsupportedJwtException;
import io.jsonwebtoken.impl.compression.DefaultCompressionCodecResolver;
import io.jsonwebtoken.impl.crypto.DefaultJwtSignatureValidator;
import io.jsonwebtoken.impl.crypto.JwtSignatureValidator;
import io.jsonwebtoken.impl.lang.LegacyServices;
import io.jsonwebtoken.io.Decoder;
import io.jsonwebtoken.io.Decoders;
import io.jsonwebtoken.io.DeserializationException;
import io.jsonwebtoken.io.Deserializer;
import io.jsonwebtoken.lang.Assert;
import io.jsonwebtoken.lang.DateFormats;
import io.jsonwebtoken.lang.Objects;
import io.jsonwebtoken.lang.Strings;
import io.jsonwebtoken.security.InvalidKeyException;
import io.jsonwebtoken.security.SignatureException;
import io.jsonwebtoken.security.WeakKeyException;
import java.security.Key;
import java.util.Date;
import java.util.Map;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes4.dex */
public class DefaultJwtParser implements JwtParser {
    private static final int MILLISECONDS_PER_SECOND = 1000;
    private long allowedClockSkewMillis;
    private Decoder<String, byte[]> base64UrlDecoder;
    private Clock clock;
    private CompressionCodecResolver compressionCodecResolver;
    private Deserializer<Map<String, ?>> deserializer;
    private Claims expectedClaims;
    private Key key;
    private byte[] keyBytes;
    private SigningKeyResolver signingKeyResolver;

    @Deprecated
    public DefaultJwtParser() {
        this.compressionCodecResolver = new DefaultCompressionCodecResolver();
        this.base64UrlDecoder = Decoders.BASE64URL;
        this.expectedClaims = new DefaultClaims();
        this.clock = DefaultClock.INSTANCE;
        this.allowedClockSkewMillis = 0L;
    }

    private static Object normalize(Object obj) {
        return obj instanceof Integer ? Long.valueOf(((Integer) obj).longValue()) : obj;
    }

    private void validateExpectedClaims(Header header, Claims claims) {
        for (String str : this.expectedClaims.keySet()) {
            Object normalize = normalize(this.expectedClaims.get(str));
            Object normalize2 = normalize(claims.get(str));
            if (normalize instanceof Date) {
                try {
                    normalize2 = claims.get(str, Date.class);
                } catch (Exception unused) {
                    throw new IncorrectClaimException(header, claims, "JWT Claim '" + str + "' was expected to be a Date, but its value cannot be converted to a Date using current heuristics.  Value: " + normalize2);
                }
            }
            InvalidClaimException missingClaimException = normalize2 == null ? new MissingClaimException(header, claims, String.format(ClaimJwtException.MISSING_EXPECTED_CLAIM_MESSAGE_TEMPLATE, str, normalize)) : !normalize.equals(normalize2) ? new IncorrectClaimException(header, claims, String.format(ClaimJwtException.INCORRECT_EXPECTED_CLAIM_MESSAGE_TEMPLATE, str, normalize, normalize2)) : null;
            if (missingClaimException != null) {
                missingClaimException.setClaimName(str);
                missingClaimException.setClaimValue(normalize);
                throw missingClaimException;
            }
        }
    }

    @Override // io.jsonwebtoken.JwtParser
    public JwtParser base64UrlDecodeWith(Decoder<String, byte[]> decoder) {
        Assert.notNull(decoder, "base64UrlDecoder cannot be null.");
        this.base64UrlDecoder = decoder;
        return this;
    }

    public JwtSignatureValidator createSignatureValidator(SignatureAlgorithm signatureAlgorithm, Key key) {
        return new DefaultJwtSignatureValidator(signatureAlgorithm, key, this.base64UrlDecoder);
    }

    @Override // io.jsonwebtoken.JwtParser
    public JwtParser deserializeJsonWith(Deserializer<Map<String, ?>> deserializer) {
        Assert.notNull(deserializer, "deserializer cannot be null.");
        this.deserializer = deserializer;
        return this;
    }

    @Override // io.jsonwebtoken.JwtParser
    public boolean isSigned(String str) {
        if (str == null) {
            return false;
        }
        int i13 = 0;
        for (int i14 = 0; i14 < str.length(); i14++) {
            char charAt = str.charAt(i14);
            if (i13 == 2) {
                return (Character.isWhitespace(charAt) || charAt == '.') ? false : true;
            }
            if (charAt == '.') {
                i13++;
            }
        }
        return false;
    }

    @Override // io.jsonwebtoken.JwtParser
    public Jwt parse(String str) {
        CompressionCodec compressionCodec;
        Header header;
        Claims claims;
        String str2;
        SigningKeyResolver signingKeyResolver;
        if (this.deserializer == null) {
            this.deserializer = (Deserializer) LegacyServices.loadFirst(Deserializer.class);
        }
        Assert.hasText(str, "JWT String argument cannot be null or empty.");
        StringBuilder sb3 = new StringBuilder(RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN);
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        SignatureAlgorithm signatureAlgorithm = null;
        String str3 = null;
        String str4 = null;
        int i13 = 0;
        int i14 = 0;
        while (true) {
            if (i13 >= length) {
                break;
            }
            char c13 = charArray[i13];
            if (c13 == '.') {
                CharSequence clean = Strings.clean(sb3);
                String charSequence = clean != null ? clean.toString() : null;
                if (i14 == 0) {
                    str4 = charSequence;
                } else if (i14 == 1) {
                    str3 = charSequence;
                }
                i14++;
                sb3.setLength(0);
            } else {
                sb3.append(c13);
            }
            i13++;
        }
        if (i14 != 2) {
            throw new MalformedJwtException(a.d("JWT strings must contain exactly 2 period characters. Found: ", i14));
        }
        String sb4 = sb3.length() > 0 ? sb3.toString() : null;
        if (str3 == null) {
            throw new MalformedJwtException(a.k("JWT string '", str, "' is missing a body/payload."));
        }
        if (str4 != null) {
            Map<String, ?> readValue = readValue(new String(this.base64UrlDecoder.decode(str4), Strings.UTF_8));
            header = sb4 != null ? new DefaultJwsHeader(readValue) : new DefaultHeader(readValue);
            compressionCodec = this.compressionCodecResolver.resolveCompressionCodec(header);
        } else {
            compressionCodec = null;
            header = null;
        }
        byte[] decode = this.base64UrlDecoder.decode(str3);
        if (compressionCodec != null) {
            decode = compressionCodec.decompress(decode);
        }
        String str5 = new String(decode, Strings.UTF_8);
        DefaultClaims defaultClaims = (str5.charAt(0) == '{' && str5.charAt(str5.length() - 1) == '}') ? new DefaultClaims(readValue(str5)) : null;
        if (sb4 != null) {
            JwsHeader jwsHeader = (JwsHeader) header;
            if (header != null) {
                String algorithm = jwsHeader.getAlgorithm();
                if (Strings.hasText(algorithm)) {
                    signatureAlgorithm = SignatureAlgorithm.forName(algorithm);
                }
            }
            if (signatureAlgorithm == null || signatureAlgorithm == SignatureAlgorithm.NONE) {
                throw new MalformedJwtException("JWT string has a digest/signature, but the header does not reference a valid signature algorithm.");
            }
            Key key = this.key;
            if (key != null && this.keyBytes != null) {
                throw new IllegalStateException("A key object and key bytes cannot both be specified. Choose either.");
            }
            if ((key != null || this.keyBytes != null) && this.signingKeyResolver != null) {
                throw new IllegalStateException(a.k("A signing key resolver and ", key != null ? "a key object" : "key bytes", " cannot both be specified. Choose either."));
            }
            if (key == null) {
                byte[] bArr = this.keyBytes;
                if (Objects.isEmpty(bArr) && (signingKeyResolver = this.signingKeyResolver) != null) {
                    key = defaultClaims != null ? signingKeyResolver.resolveSigningKey(jwsHeader, defaultClaims) : signingKeyResolver.resolveSigningKey(jwsHeader, str5);
                }
                if (!Objects.isEmpty(bArr)) {
                    Assert.isTrue(signatureAlgorithm.isHmac(), "Key bytes can only be specified for HMAC signatures. Please specify a PublicKey or PrivateKey instance.");
                    key = new SecretKeySpec(bArr, signatureAlgorithm.getJcaName());
                }
            }
            Assert.notNull(key, "A signing key must be specified if the specified JWT is digitally signed.");
            String str6 = str4 + '.' + str3;
            try {
                signatureAlgorithm.assertValidVerificationKey(key);
                if (!createSignatureValidator(signatureAlgorithm, key).isValid(str6, sb4)) {
                    throw new SignatureException("JWT signature does not match locally computed signature. JWT validity cannot be asserted and should not be trusted.");
                }
            } catch (WeakKeyException e13) {
                throw e13;
            } catch (InvalidKeyException e14) {
                e = e14;
                String value = signatureAlgorithm.getValue();
                StringBuilder o13 = cb.o("The parsed JWT indicates it was signed with the ", value, " signature algorithm, but the specified signing key of type ");
                o13.append(key.getClass().getName());
                o13.append(" may not be used to validate ");
                o13.append(value);
                o13.append(" signatures.  Because the specified signing key reflects a specific and expected algorithm, and the JWT does not reflect this algorithm, it is likely that the JWT was not expected and therefore should not be trusted.  Another possibility is that the parser was configured with the incorrect signing key, but this cannot be assumed for security reasons.");
                throw new UnsupportedJwtException(o13.toString(), e);
            } catch (IllegalArgumentException e15) {
                e = e15;
                String value2 = signatureAlgorithm.getValue();
                StringBuilder o132 = cb.o("The parsed JWT indicates it was signed with the ", value2, " signature algorithm, but the specified signing key of type ");
                o132.append(key.getClass().getName());
                o132.append(" may not be used to validate ");
                o132.append(value2);
                o132.append(" signatures.  Because the specified signing key reflects a specific and expected algorithm, and the JWT does not reflect this algorithm, it is likely that the JWT was not expected and therefore should not be trusted.  Another possibility is that the parser was configured with the incorrect signing key, but this cannot be assumed for security reasons.");
                throw new UnsupportedJwtException(o132.toString(), e);
            }
        }
        boolean z13 = this.allowedClockSkewMillis > 0;
        if (defaultClaims != null) {
            Date now = this.clock.now();
            long time = now.getTime();
            Date expiration = defaultClaims.getExpiration();
            if (expiration != null) {
                DefaultClaims defaultClaims2 = defaultClaims;
                long j13 = time - this.allowedClockSkewMillis;
                if ((z13 ? new Date(j13) : now).after(expiration)) {
                    String formatIso8601 = DateFormats.formatIso8601(expiration, false);
                    String formatIso86012 = DateFormats.formatIso8601(now, false);
                    long time2 = j13 - expiration.getTime();
                    StringBuilder w13 = a.w("JWT expired at ", formatIso8601, ". Current time: ", formatIso86012, ", a difference of ");
                    w13.append(time2);
                    w13.append(" milliseconds.  Allowed clock skew: ");
                    throw new ExpiredJwtException(header, defaultClaims2, a.o(w13, this.allowedClockSkewMillis, " milliseconds."));
                }
                claims = defaultClaims2;
            } else {
                claims = defaultClaims;
            }
            Date notBefore = claims.getNotBefore();
            str2 = sb4;
            if (notBefore != null) {
                Header header2 = header;
                long j14 = time + this.allowedClockSkewMillis;
                if ((z13 ? new Date(j14) : now).before(notBefore)) {
                    String formatIso86013 = DateFormats.formatIso8601(notBefore, false);
                    String formatIso86014 = DateFormats.formatIso8601(now, false);
                    long time3 = notBefore.getTime() - j14;
                    StringBuilder w14 = a.w("JWT must not be accepted before ", formatIso86013, ". Current time: ", formatIso86014, ", a difference of ");
                    w14.append(time3);
                    w14.append(" milliseconds.  Allowed clock skew: ");
                    throw new PrematureJwtException(header2, claims, a.o(w14, this.allowedClockSkewMillis, " milliseconds."));
                }
                header = header2;
            }
            validateExpectedClaims(header, claims);
        } else {
            claims = defaultClaims;
            str2 = sb4;
        }
        if (claims != null) {
            str5 = claims;
        }
        return str2 != null ? new DefaultJws((JwsHeader) header, str5, str2) : new DefaultJwt(header, str5);
    }

    @Override // io.jsonwebtoken.JwtParser
    public Jws<Claims> parseClaimsJws(String str) {
        return (Jws) parse(str, new JwtHandlerAdapter<Jws<Claims>>() { // from class: io.jsonwebtoken.impl.DefaultJwtParser.4
            @Override // io.jsonwebtoken.JwtHandlerAdapter, io.jsonwebtoken.JwtHandler
            public Jws<Claims> onClaimsJws(Jws<Claims> jws) {
                return jws;
            }

            @Override // io.jsonwebtoken.JwtHandlerAdapter, io.jsonwebtoken.JwtHandler
            public /* bridge */ /* synthetic */ Object onClaimsJws(Jws jws) {
                return onClaimsJws((Jws<Claims>) jws);
            }
        });
    }

    @Override // io.jsonwebtoken.JwtParser
    public Jwt<Header, Claims> parseClaimsJwt(String str) {
        try {
            return (Jwt) parse(str, new JwtHandlerAdapter<Jwt<Header, Claims>>() { // from class: io.jsonwebtoken.impl.DefaultJwtParser.2
                @Override // io.jsonwebtoken.JwtHandlerAdapter, io.jsonwebtoken.JwtHandler
                public Jwt<Header, Claims> onClaimsJwt(Jwt<Header, Claims> jwt) {
                    return jwt;
                }

                @Override // io.jsonwebtoken.JwtHandlerAdapter, io.jsonwebtoken.JwtHandler
                public /* bridge */ /* synthetic */ Object onClaimsJwt(Jwt jwt) {
                    return onClaimsJwt((Jwt<Header, Claims>) jwt);
                }
            });
        } catch (IllegalArgumentException e13) {
            throw new UnsupportedJwtException("Signed JWSs are not supported.", e13);
        }
    }

    @Override // io.jsonwebtoken.JwtParser
    public Jws<String> parsePlaintextJws(String str) {
        try {
            return (Jws) parse(str, new JwtHandlerAdapter<Jws<String>>() { // from class: io.jsonwebtoken.impl.DefaultJwtParser.3
                @Override // io.jsonwebtoken.JwtHandlerAdapter, io.jsonwebtoken.JwtHandler
                public Jws<String> onPlaintextJws(Jws<String> jws) {
                    return jws;
                }

                @Override // io.jsonwebtoken.JwtHandlerAdapter, io.jsonwebtoken.JwtHandler
                public /* bridge */ /* synthetic */ Object onPlaintextJws(Jws jws) {
                    return onPlaintextJws((Jws<String>) jws);
                }
            });
        } catch (IllegalArgumentException e13) {
            throw new UnsupportedJwtException("Signed JWSs are not supported.", e13);
        }
    }

    @Override // io.jsonwebtoken.JwtParser
    public Jwt<Header, String> parsePlaintextJwt(String str) {
        return (Jwt) parse(str, new JwtHandlerAdapter<Jwt<Header, String>>() { // from class: io.jsonwebtoken.impl.DefaultJwtParser.1
            @Override // io.jsonwebtoken.JwtHandlerAdapter, io.jsonwebtoken.JwtHandler
            public Jwt<Header, String> onPlaintextJwt(Jwt<Header, String> jwt) {
                return jwt;
            }

            @Override // io.jsonwebtoken.JwtHandlerAdapter, io.jsonwebtoken.JwtHandler
            public /* bridge */ /* synthetic */ Object onPlaintextJwt(Jwt jwt) {
                return onPlaintextJwt((Jwt<Header, String>) jwt);
            }
        });
    }

    public Map<String, ?> readValue(String str) {
        try {
            return this.deserializer.deserialize(str.getBytes(Strings.UTF_8));
        } catch (DeserializationException e13) {
            throw new MalformedJwtException(a.j("Unable to read JSON value: ", str), e13);
        }
    }

    @Override // io.jsonwebtoken.JwtParser
    public JwtParser require(String str, Object obj) {
        Assert.hasText(str, "claim name cannot be null or empty.");
        Assert.notNull(obj, "The value cannot be null for claim name: " + str);
        this.expectedClaims.put(str, obj);
        return this;
    }

    @Override // io.jsonwebtoken.JwtParser
    public JwtParser requireAudience(String str) {
        this.expectedClaims.setAudience(str);
        return this;
    }

    @Override // io.jsonwebtoken.JwtParser
    public JwtParser requireExpiration(Date date) {
        this.expectedClaims.setExpiration(date);
        return this;
    }

    @Override // io.jsonwebtoken.JwtParser
    public JwtParser requireId(String str) {
        this.expectedClaims.setId(str);
        return this;
    }

    @Override // io.jsonwebtoken.JwtParser
    public JwtParser requireIssuedAt(Date date) {
        this.expectedClaims.setIssuedAt(date);
        return this;
    }

    @Override // io.jsonwebtoken.JwtParser
    public JwtParser requireIssuer(String str) {
        this.expectedClaims.setIssuer(str);
        return this;
    }

    @Override // io.jsonwebtoken.JwtParser
    public JwtParser requireNotBefore(Date date) {
        this.expectedClaims.setNotBefore(date);
        return this;
    }

    @Override // io.jsonwebtoken.JwtParser
    public JwtParser requireSubject(String str) {
        this.expectedClaims.setSubject(str);
        return this;
    }

    @Override // io.jsonwebtoken.JwtParser
    public JwtParser setAllowedClockSkewSeconds(long j13) {
        this.allowedClockSkewMillis = Math.max(0L, j13 * 1000);
        return this;
    }

    @Override // io.jsonwebtoken.JwtParser
    public JwtParser setClock(Clock clock) {
        Assert.notNull(clock, "Clock instance cannot be null.");
        this.clock = clock;
        return this;
    }

    @Override // io.jsonwebtoken.JwtParser
    public JwtParser setCompressionCodecResolver(CompressionCodecResolver compressionCodecResolver) {
        Assert.notNull(compressionCodecResolver, "compressionCodecResolver cannot be null.");
        this.compressionCodecResolver = compressionCodecResolver;
        return this;
    }

    @Override // io.jsonwebtoken.JwtParser
    public JwtParser setSigningKey(byte[] bArr) {
        Assert.notEmpty(bArr, "signing key cannot be null or empty.");
        this.keyBytes = bArr;
        return this;
    }

    @Override // io.jsonwebtoken.JwtParser
    public JwtParser setSigningKeyResolver(SigningKeyResolver signingKeyResolver) {
        Assert.notNull(signingKeyResolver, "SigningKeyResolver cannot be null.");
        this.signingKeyResolver = signingKeyResolver;
        return this;
    }

    @Override // io.jsonwebtoken.JwtParser
    public JwtParser setSigningKey(String str) {
        Assert.hasText(str, "signing key cannot be null or empty.");
        this.keyBytes = Decoders.BASE64.decode(str);
        return this;
    }

    @Override // io.jsonwebtoken.JwtParser
    public JwtParser setSigningKey(Key key) {
        Assert.notNull(key, "signing key cannot be null.");
        this.key = key;
        return this;
    }

    public DefaultJwtParser(SigningKeyResolver signingKeyResolver, Key key, byte[] bArr, Clock clock, long j13, Claims claims, Decoder<String, byte[]> decoder, Deserializer<Map<String, ?>> deserializer, CompressionCodecResolver compressionCodecResolver) {
        this.compressionCodecResolver = new DefaultCompressionCodecResolver();
        this.base64UrlDecoder = Decoders.BASE64URL;
        this.expectedClaims = new DefaultClaims();
        Clock clock2 = DefaultClock.INSTANCE;
        this.signingKeyResolver = signingKeyResolver;
        this.key = key;
        this.keyBytes = bArr;
        this.clock = clock;
        this.allowedClockSkewMillis = j13;
        this.expectedClaims = claims;
        this.base64UrlDecoder = decoder;
        this.deserializer = deserializer;
        this.compressionCodecResolver = compressionCodecResolver;
    }

    @Override // io.jsonwebtoken.JwtParser
    public <T> T parse(String str, JwtHandler<T> jwtHandler) {
        Assert.notNull(jwtHandler, "JwtHandler argument cannot be null.");
        Assert.hasText(str, "JWT String argument cannot be null or empty.");
        Jwt<Header, String> parse = parse(str);
        if (parse instanceof Jws) {
            Jws<String> jws = (Jws) parse;
            if (jws.getBody() instanceof Claims) {
                return jwtHandler.onClaimsJws(jws);
            }
            return jwtHandler.onPlaintextJws(jws);
        }
        if (parse.getBody() instanceof Claims) {
            return jwtHandler.onClaimsJwt(parse);
        }
        return jwtHandler.onPlaintextJwt(parse);
    }
}
