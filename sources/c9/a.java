package c9;

import a7.n0;
import java.nio.ByteBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.StandardCharsets;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes3.dex */
public final class a extends dl2.b {

    /* renamed from: g, reason: collision with root package name */
    public static final Pattern f26961g = Pattern.compile("(.+?)='(.*?)';", 32);

    /* renamed from: e, reason: collision with root package name */
    public final CharsetDecoder f26962e = StandardCharsets.UTF_8.newDecoder();

    /* renamed from: f, reason: collision with root package name */
    public final CharsetDecoder f26963f = StandardCharsets.ISO_8859_1.newDecoder();

    @Override // dl2.b
    public final n0 e0(y8.a aVar, ByteBuffer byteBuffer) {
        String str;
        CharsetDecoder charsetDecoder = this.f26963f;
        CharsetDecoder charsetDecoder2 = this.f26962e;
        String str2 = null;
        try {
            str = charsetDecoder2.decode(byteBuffer).toString();
        } catch (CharacterCodingException unused) {
            try {
                String charBuffer = charsetDecoder.decode(byteBuffer).toString();
                charsetDecoder.reset();
                byteBuffer.rewind();
                str = charBuffer;
            } catch (CharacterCodingException unused2) {
                charsetDecoder.reset();
                byteBuffer.rewind();
                str = null;
            } catch (Throwable th3) {
                charsetDecoder.reset();
                byteBuffer.rewind();
                throw th3;
            }
        } finally {
            charsetDecoder2.reset();
            byteBuffer.rewind();
        }
        byte[] bArr = new byte[byteBuffer.limit()];
        byteBuffer.get(bArr);
        if (str == null) {
            return new n0(new c(bArr, null, null));
        }
        Matcher matcher = f26961g.matcher(str);
        String str3 = null;
        for (int i13 = 0; matcher.find(i13); i13 = matcher.end()) {
            String group = matcher.group(1);
            String group2 = matcher.group(2);
            if (group != null) {
                String q13 = com.bumptech.glide.c.q1(group);
                q13.getClass();
                if (q13.equals("streamurl")) {
                    str3 = group2;
                } else if (q13.equals("streamtitle")) {
                    str2 = group2;
                }
            }
        }
        return new n0(new c(bArr, str2, str3));
    }
}
