package com.bugsnag.android.repackaged.dslplatform.json;

import java.io.StringWriter;
import java.math.BigDecimal;
import java.net.InetAddress;
import java.net.URI;
import java.util.UUID;
import javax.xml.parsers.DocumentBuilder;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.ls.DOMImplementationLS;
import org.w3c.dom.ls.LSOutput;
import org.w3c.dom.ls.LSSerializer;

/* loaded from: classes3.dex */
public final class c implements u {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f29484a;

    @Override // com.bugsnag.android.repackaged.dslplatform.json.u
    public final void a(v vVar, Object obj) {
        int i13 = 0;
        int i14 = 1;
        switch (this.f29484a) {
            case 0:
                byte[] bArr = (byte[]) obj;
                if (bArr != null) {
                    if (bArr.length != 0) {
                        int i15 = vVar.f29593a;
                        if ((bArr.length << 1) + i15 + 2 >= vVar.f29595c.length) {
                            vVar.a(i15, (bArr.length << 1) + 2);
                        }
                        byte[] bArr2 = vVar.f29595c;
                        int i16 = vVar.f29593a;
                        int i17 = i16 + 1;
                        vVar.f29593a = i17;
                        bArr2[i16] = 34;
                        char[] cArr = a.f29479a;
                        int length = bArr.length;
                        int i18 = (length / 3) * 3;
                        int i19 = length - 1;
                        int i23 = ((i19 / 3) + 1) << 2;
                        int i24 = i17;
                        int i25 = 0;
                        while (true) {
                            byte[] bArr3 = a.f29480b;
                            if (i25 >= i18) {
                                int i26 = length - i18;
                                if (i26 > 0) {
                                    int i27 = ((bArr[i18] & 255) << 10) | (i26 == 2 ? (bArr[i19] & 255) << 2 : 0);
                                    int i28 = i17 + i23;
                                    bArr2[i28 - 4] = bArr3[i27 >> 12];
                                    bArr2[i28 - 3] = bArr3[(i27 >>> 6) & 63];
                                    bArr2[i28 - 2] = i26 == 2 ? bArr3[i27 & 63] : (byte) 61;
                                    bArr2[i28 - 1] = 61;
                                }
                                int i29 = i17 + i23;
                                byte[] bArr4 = vVar.f29595c;
                                vVar.f29593a = i29 + 1;
                                bArr4[i29] = 34;
                                break;
                            } else {
                                int i33 = i25 + 2;
                                int i34 = ((bArr[i25 + 1] & 255) << 8) | ((bArr[i25] & 255) << 16);
                                i25 += 3;
                                int i35 = i34 | (bArr[i33] & 255);
                                bArr2[i24] = bArr3[(i35 >>> 18) & 63];
                                bArr2[i24 + 1] = bArr3[(i35 >>> 12) & 63];
                                int i36 = i24 + 3;
                                bArr2[i24 + 2] = bArr3[(i35 >>> 6) & 63];
                                i24 += 4;
                                bArr2[i36] = bArr3[i35 & 63];
                            }
                        }
                    } else {
                        vVar.c("\"\"");
                        break;
                    }
                } else {
                    vVar.e();
                    break;
                }
            case 1:
                Boolean bool = (Boolean) obj;
                if (bool != null) {
                    if (!bool.booleanValue()) {
                        vVar.c("false");
                        break;
                    } else {
                        vVar.c("true");
                        break;
                    }
                } else {
                    vVar.e();
                    break;
                }
            case 2:
                boolean[] zArr = (boolean[]) obj;
                if (zArr != null) {
                    if (zArr.length != 0) {
                        vVar.d((byte) 91);
                        vVar.c(zArr[0] ? "true" : "false");
                        while (i14 < zArr.length) {
                            vVar.c(zArr[i14] ? ",true" : ",false");
                            i14++;
                        }
                        vVar.d((byte) 93);
                        break;
                    } else {
                        vVar.c("[]");
                        break;
                    }
                } else {
                    vVar.e();
                    break;
                }
            case 3:
            default:
                Element element = (Element) obj;
                DocumentBuilder documentBuilder = z.f29628a;
                if (element != null) {
                    Document ownerDocument = element.getOwnerDocument();
                    DOMImplementationLS dOMImplementationLS = (DOMImplementationLS) ownerDocument.getImplementation();
                    LSSerializer createLSSerializer = dOMImplementationLS.createLSSerializer();
                    LSOutput createLSOutput = dOMImplementationLS.createLSOutput();
                    createLSOutput.setEncoding("UTF-8");
                    StringWriter stringWriter = new StringWriter();
                    createLSOutput.setCharacterStream(stringWriter);
                    createLSSerializer.write(ownerDocument, createLSOutput);
                    vVar.g(stringWriter.toString());
                    break;
                } else {
                    vVar.e();
                    break;
                }
            case 4:
                URI uri = (URI) obj;
                if (uri != null) {
                    vVar.g(uri.toString());
                    break;
                } else {
                    vVar.e();
                    break;
                }
            case 5:
                InetAddress inetAddress = (InetAddress) obj;
                if (inetAddress != null) {
                    vVar.d((byte) 34);
                    vVar.c(inetAddress.getHostAddress());
                    vVar.d((byte) 34);
                    break;
                } else {
                    vVar.e();
                    break;
                }
            case 6:
                float[] fArr = (float[]) obj;
                short[] sArr = w.f29598a;
                if (fArr != null) {
                    if (fArr.length != 0) {
                        vVar.d((byte) 91);
                        w.z(fArr[0], vVar);
                        while (i14 < fArr.length) {
                            vVar.d((byte) 44);
                            w.z(fArr[i14], vVar);
                            i14++;
                        }
                        vVar.d((byte) 93);
                        break;
                    } else {
                        vVar.c("[]");
                        break;
                    }
                } else {
                    vVar.e();
                    break;
                }
            case 7:
                Integer num = (Integer) obj;
                short[] sArr2 = w.f29598a;
                if (num != null) {
                    w.A(num.intValue(), vVar);
                    break;
                } else {
                    vVar.e();
                    break;
                }
            case 8:
                int[] iArr = (int[]) obj;
                short[] sArr3 = w.f29598a;
                if (iArr != null) {
                    if (iArr.length != 0) {
                        byte[] b13 = vVar.b((iArr.length * 11) + 2);
                        int i37 = vVar.f29593a;
                        b13[i37] = 91;
                        int x13 = w.x(b13, i37 + 1, iArr[0]);
                        while (i14 < iArr.length) {
                            b13[x13] = 44;
                            x13 = w.x(b13, x13 + 1, iArr[i14]);
                            i14++;
                        }
                        b13[x13] = 93;
                        int i38 = vVar.f29593a;
                        vVar.f29593a = ((x13 + 1) - i38) + i38;
                        break;
                    } else {
                        vVar.c("[]");
                        break;
                    }
                } else {
                    vVar.e();
                    break;
                }
            case 9:
                Short sh3 = (Short) obj;
                if (sh3 != null) {
                    w.A(sh3.intValue(), vVar);
                    break;
                } else {
                    vVar.e();
                    break;
                }
            case 10:
                short[] sArr4 = (short[]) obj;
                short[] sArr5 = w.f29598a;
                if (sArr4 != null) {
                    if (sArr4.length != 0) {
                        vVar.d((byte) 91);
                        w.A(sArr4[0], vVar);
                        while (i14 < sArr4.length) {
                            vVar.d((byte) 44);
                            w.A(sArr4[i14], vVar);
                            i14++;
                        }
                        vVar.d((byte) 93);
                        break;
                    } else {
                        vVar.c("[]");
                        break;
                    }
                } else {
                    vVar.e();
                    break;
                }
            case 11:
                Long l13 = (Long) obj;
                short[] sArr6 = w.f29598a;
                if (l13 != null) {
                    long longValue = l13.longValue();
                    byte[] b14 = vVar.b(21);
                    int i39 = vVar.f29593a;
                    vVar.f29593a += w.w(longValue, i39, b14) - i39;
                    break;
                } else {
                    vVar.e();
                    break;
                }
            case 12:
                long[] jArr = (long[]) obj;
                short[] sArr7 = w.f29598a;
                if (jArr != null) {
                    if (jArr.length != 0) {
                        byte[] b15 = vVar.b((jArr.length * 21) + 2);
                        int i43 = vVar.f29593a;
                        b15[i43] = 91;
                        int w13 = w.w(jArr[0], i43 + 1, b15);
                        while (i14 < jArr.length) {
                            b15[w13] = 44;
                            w13 = w.w(jArr[i14], w13 + 1, b15);
                            i14++;
                        }
                        b15[w13] = 93;
                        int i44 = vVar.f29593a;
                        vVar.f29593a = ((w13 + 1) - i44) + i44;
                        break;
                    } else {
                        vVar.c("[]");
                        break;
                    }
                } else {
                    vVar.e();
                    break;
                }
            case 13:
                BigDecimal bigDecimal = (BigDecimal) obj;
                short[] sArr8 = w.f29598a;
                if (bigDecimal != null) {
                    vVar.c(bigDecimal.toString());
                    break;
                } else {
                    vVar.e();
                    break;
                }
            case 14:
                Double d2 = (Double) obj;
                short[] sArr9 = w.f29598a;
                if (d2 != null) {
                    w.y(d2.doubleValue(), vVar);
                    break;
                } else {
                    vVar.e();
                    break;
                }
            case 15:
                double[] dArr = (double[]) obj;
                short[] sArr10 = w.f29598a;
                if (dArr != null) {
                    if (dArr.length != 0) {
                        vVar.d((byte) 91);
                        w.y(dArr[0], vVar);
                        while (i14 < dArr.length) {
                            vVar.d((byte) 44);
                            w.y(dArr[i14], vVar);
                            i14++;
                        }
                        vVar.d((byte) 93);
                        break;
                    } else {
                        vVar.c("[]");
                        break;
                    }
                } else {
                    vVar.e();
                    break;
                }
            case 16:
                Float f13 = (Float) obj;
                short[] sArr11 = w.f29598a;
                if (f13 != null) {
                    w.z(f13.floatValue(), vVar);
                    break;
                } else {
                    vVar.e();
                    break;
                }
            case 17:
                String str = (String) obj;
                if (str != null) {
                    vVar.g(str);
                    break;
                } else {
                    vVar.e();
                    break;
                }
            case 18:
                CharSequence charSequence = (CharSequence) obj;
                if (charSequence != null) {
                    int length2 = charSequence.length();
                    int i45 = vVar.f29593a;
                    int i46 = length2 << 2;
                    int i47 = length2 << 1;
                    if (i45 + i46 + i47 + 2 >= vVar.f29595c.length) {
                        vVar.a(i45, i46 + i47 + 2);
                    }
                    byte[] bArr5 = vVar.f29595c;
                    int i48 = vVar.f29593a;
                    bArr5[i48] = 34;
                    int i49 = i48 + 1;
                    while (i13 < length2) {
                        char charAt = charSequence.charAt(i13);
                        if (charAt <= 31 || charAt == '\"' || charAt == '\\' || charAt >= '~') {
                            vVar.f(i13, i49, length2, charSequence);
                        } else {
                            bArr5[i49] = (byte) charAt;
                            i13++;
                            i49++;
                        }
                    }
                    bArr5[i49] = 34;
                    vVar.f29593a = i49 + 1;
                    break;
                } else {
                    vVar.e();
                    break;
                }
                break;
            case 19:
                UUID uuid = (UUID) obj;
                b bVar = y.f29624a;
                if (uuid != null) {
                    long mostSignificantBits = uuid.getMostSignificantBits();
                    long leastSignificantBits = uuid.getLeastSignificantBits();
                    int i53 = (int) (mostSignificantBits >> 32);
                    int i54 = (int) mostSignificantBits;
                    int i55 = (int) (leastSignificantBits >> 32);
                    int i56 = (int) leastSignificantBits;
                    byte[] b16 = vVar.b(38);
                    int i57 = vVar.f29593a;
                    b16[i57] = 34;
                    char[] cArr2 = y.f29626c;
                    char c13 = cArr2[(i53 >> 24) & 255];
                    b16[i57 + 1] = (byte) (c13 >> '\b');
                    b16[i57 + 2] = (byte) c13;
                    char c14 = cArr2[(i53 >> 16) & 255];
                    b16[i57 + 3] = (byte) (c14 >> '\b');
                    b16[i57 + 4] = (byte) c14;
                    char c15 = cArr2[(i53 >> 8) & 255];
                    b16[i57 + 5] = (byte) (c15 >> '\b');
                    b16[i57 + 6] = (byte) c15;
                    char c16 = cArr2[i53 & 255];
                    b16[i57 + 7] = (byte) (c16 >> '\b');
                    b16[i57 + 8] = (byte) c16;
                    b16[i57 + 9] = 45;
                    char c17 = cArr2[(i54 >> 24) & 255];
                    b16[i57 + 10] = (byte) (c17 >> '\b');
                    b16[i57 + 11] = (byte) c17;
                    char c18 = cArr2[(i54 >> 16) & 255];
                    b16[i57 + 12] = (byte) (c18 >> '\b');
                    b16[i57 + 13] = (byte) c18;
                    b16[i57 + 14] = 45;
                    char c19 = cArr2[(i54 >> 8) & 255];
                    b16[i57 + 15] = (byte) (c19 >> '\b');
                    b16[i57 + 16] = (byte) c19;
                    char c23 = cArr2[i54 & 255];
                    b16[i57 + 17] = (byte) (c23 >> '\b');
                    b16[i57 + 18] = (byte) c23;
                    b16[i57 + 19] = 45;
                    char c24 = cArr2[(i55 >> 24) & 255];
                    b16[i57 + 20] = (byte) (c24 >> '\b');
                    b16[i57 + 21] = (byte) c24;
                    char c25 = cArr2[(i55 >> 16) & 255];
                    b16[i57 + 22] = (byte) (c25 >> '\b');
                    b16[i57 + 23] = (byte) c25;
                    b16[i57 + 24] = 45;
                    char c26 = cArr2[(i55 >> 8) & 255];
                    b16[i57 + 25] = (byte) (c26 >> '\b');
                    b16[i57 + 26] = (byte) c26;
                    char c27 = cArr2[i55 & 255];
                    b16[i57 + 27] = (byte) (c27 >> '\b');
                    b16[i57 + 28] = (byte) c27;
                    char c28 = cArr2[(i56 >> 24) & 255];
                    b16[i57 + 29] = (byte) (c28 >> '\b');
                    b16[i57 + 30] = (byte) c28;
                    char c29 = cArr2[(i56 >> 16) & 255];
                    b16[i57 + 31] = (byte) (c29 >> '\b');
                    b16[i57 + 32] = (byte) c29;
                    char c33 = cArr2[(i56 >> 8) & 255];
                    b16[i57 + 33] = (byte) (c33 >> '\b');
                    b16[i57 + 34] = (byte) c33;
                    char c34 = cArr2[i56 & 255];
                    b16[i57 + 35] = (byte) (c34 >> '\b');
                    b16[i57 + 36] = (byte) c34;
                    b16[i57 + 37] = 34;
                    vVar.f29593a = i57 + 38;
                    break;
                } else {
                    vVar.e();
                    break;
                }
        }
    }
}
