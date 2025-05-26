package wd;

import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser$Reader$EndOfFileException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;

/* loaded from: classes.dex */
public final class j implements nd.f {

    /* renamed from: a, reason: collision with root package name */
    public static final byte[] f129173a = "Exif\u0000\u0000".getBytes(Charset.forName("UTF-8"));

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f129174b = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8};

    public static int e(i iVar, qd.i iVar2) {
        try {
            int a13 = iVar.a();
            if ((a13 & 65496) != 65496 && a13 != 19789 && a13 != 18761) {
                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    Log.d("DfltImageHeaderParser", "Parser doesn't handle magic number: " + a13);
                }
                return -1;
            }
            int g13 = g(iVar);
            if (g13 == -1) {
                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    Log.d("DfltImageHeaderParser", "Failed to parse exif segment length, or exif segment not found");
                }
                return -1;
            }
            byte[] bArr = (byte[]) iVar2.c(g13, byte[].class);
            try {
                return h(iVar, bArr, g13);
            } finally {
                iVar2.h(bArr);
            }
        } catch (DefaultImageHeaderParser$Reader$EndOfFileException unused) {
            return -1;
        }
    }

    public static ImageHeaderParser$ImageType f(i iVar) {
        try {
            int a13 = iVar.a();
            if (a13 == 65496) {
                return ImageHeaderParser$ImageType.JPEG;
            }
            int e13 = (a13 << 8) | iVar.e();
            if (e13 == 4671814) {
                return ImageHeaderParser$ImageType.GIF;
            }
            int e14 = (e13 << 8) | iVar.e();
            if (e14 == -1991225785) {
                iVar.skip(21L);
                try {
                    return iVar.e() >= 3 ? ImageHeaderParser$ImageType.PNG_A : ImageHeaderParser$ImageType.PNG;
                } catch (DefaultImageHeaderParser$Reader$EndOfFileException unused) {
                    return ImageHeaderParser$ImageType.PNG;
                }
            }
            if (e14 != 1380533830) {
                return i(iVar, e14);
            }
            iVar.skip(4L);
            if (((iVar.a() << 16) | iVar.a()) != 1464156752) {
                return ImageHeaderParser$ImageType.UNKNOWN;
            }
            int a14 = (iVar.a() << 16) | iVar.a();
            if ((a14 & (-256)) != 1448097792) {
                return ImageHeaderParser$ImageType.UNKNOWN;
            }
            int i13 = a14 & 255;
            if (i13 == 88) {
                iVar.skip(4L);
                short e15 = iVar.e();
                return (e15 & 2) != 0 ? ImageHeaderParser$ImageType.ANIMATED_WEBP : (e15 & 16) != 0 ? ImageHeaderParser$ImageType.WEBP_A : ImageHeaderParser$ImageType.WEBP;
            }
            if (i13 != 76) {
                return ImageHeaderParser$ImageType.WEBP;
            }
            iVar.skip(4L);
            return (iVar.e() & 8) != 0 ? ImageHeaderParser$ImageType.WEBP_A : ImageHeaderParser$ImageType.WEBP;
        } catch (DefaultImageHeaderParser$Reader$EndOfFileException unused2) {
            return ImageHeaderParser$ImageType.UNKNOWN;
        }
    }

    public static int g(i iVar) {
        short e13;
        int a13;
        long j13;
        long skip;
        do {
            short e14 = iVar.e();
            if (e14 != 255) {
                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    Log.d("DfltImageHeaderParser", "Unknown segmentId=" + ((int) e14));
                }
                return -1;
            }
            e13 = iVar.e();
            if (e13 == 218) {
                return -1;
            }
            if (e13 == 217) {
                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    Log.d("DfltImageHeaderParser", "Found MARKER_EOI in exif segment");
                }
                return -1;
            }
            a13 = iVar.a() - 2;
            if (e13 == 225) {
                return a13;
            }
            j13 = a13;
            skip = iVar.skip(j13);
        } while (skip == j13);
        if (Log.isLoggable("DfltImageHeaderParser", 3)) {
            StringBuilder t13 = a.a.t("Unable to skip enough data, type: ", e13, ", wanted to skip: ", a13, ", but actually skipped: ");
            t13.append(skip);
            Log.d("DfltImageHeaderParser", t13.toString());
        }
        return -1;
    }

    public static int h(i iVar, byte[] bArr, int i13) {
        ByteOrder byteOrder;
        int d2 = iVar.d(i13, bArr);
        if (d2 != i13) {
            if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                Log.d("DfltImageHeaderParser", "Unable to read exif segment data, length: " + i13 + ", actually read: " + d2);
            }
            return -1;
        }
        short s13 = 1;
        int i14 = 0;
        byte[] bArr2 = f129173a;
        boolean z13 = bArr != null && i13 > bArr2.length;
        if (z13) {
            for (int i15 = 0; i15 < bArr2.length; i15++) {
                if (bArr[i15] != bArr2[i15]) {
                    break;
                }
            }
        }
        if (z13) {
            h6.b0 b0Var = new h6.b0(bArr, i13);
            short f13 = b0Var.f(6);
            if (f13 == 18761) {
                byteOrder = ByteOrder.LITTLE_ENDIAN;
            } else if (f13 != 19789) {
                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    Log.d("DfltImageHeaderParser", "Unknown endianness = " + ((int) f13));
                }
                byteOrder = ByteOrder.BIG_ENDIAN;
            } else {
                byteOrder = ByteOrder.BIG_ENDIAN;
            }
            ByteBuffer byteBuffer = b0Var.f67701a;
            byteBuffer.order(byteOrder);
            int i16 = byteBuffer.remaining() - 10 >= 4 ? byteBuffer.getInt(10) : -1;
            short f14 = b0Var.f(i16 + 6);
            while (i14 < f14) {
                int i17 = (i14 * 12) + i16 + 8;
                short f15 = b0Var.f(i17);
                if (f15 == 274) {
                    short f16 = b0Var.f(i17 + 2);
                    if (f16 >= s13 && f16 <= 12) {
                        int i18 = i17 + 4;
                        int i19 = byteBuffer.remaining() - i18 >= 4 ? byteBuffer.getInt(i18) : -1;
                        if (i19 >= 0) {
                            if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                StringBuilder t13 = a.a.t("Got tagIndex=", i14, " tagType=", f15, " formatCode=");
                                t13.append((int) f16);
                                t13.append(" componentCount=");
                                t13.append(i19);
                                Log.d("DfltImageHeaderParser", t13.toString());
                            }
                            int i23 = i19 + f129174b[f16];
                            if (i23 <= 4) {
                                int i24 = i17 + 8;
                                if (i24 >= 0 && i24 <= byteBuffer.remaining()) {
                                    if (i23 >= 0 && i23 + i24 <= byteBuffer.remaining()) {
                                        return b0Var.f(i24);
                                    }
                                    if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                        Log.d("DfltImageHeaderParser", "Illegal number of bytes for TI tag data tagType=" + ((int) f15));
                                    }
                                } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                    Log.d("DfltImageHeaderParser", "Illegal tagValueOffset=" + i24 + " tagType=" + ((int) f15));
                                }
                            } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                Log.d("DfltImageHeaderParser", "Got byte count > 4, not orientation, continuing, formatCode=" + ((int) f16));
                            }
                        } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                            Log.d("DfltImageHeaderParser", "Negative tiff component count");
                        }
                    } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                        Log.d("DfltImageHeaderParser", "Got invalid format code = " + ((int) f16));
                    }
                }
                i14++;
                s13 = 1;
            }
            return -1;
        }
        if (Log.isLoggable("DfltImageHeaderParser", 3)) {
            Log.d("DfltImageHeaderParser", "Missing jpeg exif preamble");
        }
        return -1;
    }

    public static ImageHeaderParser$ImageType i(i iVar, int i13) {
        if (((iVar.a() << 16) | iVar.a()) != 1718909296) {
            return ImageHeaderParser$ImageType.UNKNOWN;
        }
        int a13 = (iVar.a() << 16) | iVar.a();
        if (a13 == 1635150195) {
            return ImageHeaderParser$ImageType.ANIMATED_AVIF;
        }
        int i14 = 0;
        boolean z13 = a13 == 1635150182;
        iVar.skip(4L);
        int i15 = i13 - 16;
        if (i15 % 4 == 0) {
            while (i14 < 5 && i15 > 0) {
                int a14 = (iVar.a() << 16) | iVar.a();
                if (a14 == 1635150195) {
                    return ImageHeaderParser$ImageType.ANIMATED_AVIF;
                }
                if (a14 == 1635150182) {
                    z13 = true;
                }
                i14++;
                i15 -= 4;
            }
        }
        return z13 ? ImageHeaderParser$ImageType.AVIF : ImageHeaderParser$ImageType.UNKNOWN;
    }

    @Override // nd.f
    public final int a(InputStream inputStream, qd.i iVar) {
        d7.b.p(inputStream, "Argument must not be null");
        nd.g gVar = new nd.g(inputStream);
        d7.b.p(iVar, "Argument must not be null");
        return e(gVar, iVar);
    }

    @Override // nd.f
    public final ImageHeaderParser$ImageType b(ByteBuffer byteBuffer) {
        d7.b.p(byteBuffer, "Argument must not be null");
        return f(new h6.b0(2, byteBuffer));
    }

    @Override // nd.f
    public final int c(ByteBuffer byteBuffer, qd.i iVar) {
        d7.b.p(byteBuffer, "Argument must not be null");
        h6.b0 b0Var = new h6.b0(2, byteBuffer);
        d7.b.p(iVar, "Argument must not be null");
        return e(b0Var, iVar);
    }

    @Override // nd.f
    public final ImageHeaderParser$ImageType d(InputStream inputStream) {
        d7.b.p(inputStream, "Argument must not be null");
        return f(new nd.g(inputStream));
    }
}
