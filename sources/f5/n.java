package f5;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.graphics.fonts.FontStyle;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/* loaded from: classes.dex */
public final class n extends o {
    public static Font h(FontFamily fontFamily, int i13) {
        FontStyle fontStyle = new FontStyle((i13 & 1) != 0 ? 700 : 400, (i13 & 2) != 0 ? 1 : 0);
        Font font = fontFamily.getFont(0);
        int j13 = j(fontStyle, font.getStyle());
        for (int i14 = 1; i14 < fontFamily.getSize(); i14++) {
            Font font2 = fontFamily.getFont(i14);
            int j14 = j(fontStyle, font2.getStyle());
            if (j14 < j13) {
                font = font2;
                j13 = j14;
            }
        }
        return font;
    }

    public static FontFamily i(m5.g[] gVarArr, ContentResolver contentResolver) {
        int i13;
        ParcelFileDescriptor openFileDescriptor;
        int length = gVarArr.length;
        FontFamily.Builder builder = null;
        while (i13 < length) {
            m5.g gVar = gVarArr[i13];
            try {
                openFileDescriptor = contentResolver.openFileDescriptor(gVar.f85855a, "r", null);
            } catch (IOException e13) {
                Log.w("TypefaceCompatApi29Impl", "Font load failed", e13);
            }
            if (openFileDescriptor == null) {
                i13 = openFileDescriptor == null ? i13 + 1 : 0;
            } else {
                try {
                    Font build = new Font.Builder(openFileDescriptor).setWeight(gVar.f85857c).setSlant(gVar.f85858d ? 1 : 0).setTtcIndex(gVar.f85856b).build();
                    if (builder == null) {
                        builder = new FontFamily.Builder(build);
                    } else {
                        builder.addFont(build);
                    }
                } catch (Throwable th3) {
                    try {
                        openFileDescriptor.close();
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                    throw th3;
                }
            }
            openFileDescriptor.close();
        }
        if (builder == null) {
            return null;
        }
        return builder.build();
    }

    public static int j(FontStyle fontStyle, FontStyle fontStyle2) {
        return (Math.abs(fontStyle.getWeight() - fontStyle2.getWeight()) / 100) + (fontStyle.getSlant() == fontStyle2.getSlant() ? 0 : 2);
    }

    @Override // f5.o
    public final Typeface a(Context context, e5.f fVar, Resources resources, int i13) {
        try {
            FontFamily.Builder builder = null;
            for (e5.g gVar : fVar.f57218a) {
                try {
                    Font build = new Font.Builder(resources, gVar.f57224f).setWeight(gVar.f57220b).setSlant(gVar.f57221c ? 1 : 0).setTtcIndex(gVar.f57223e).setFontVariationSettings(gVar.f57222d).build();
                    if (builder == null) {
                        builder = new FontFamily.Builder(build);
                    } else {
                        builder.addFont(build);
                    }
                } catch (IOException unused) {
                }
            }
            if (builder == null) {
                return null;
            }
            FontFamily build2 = builder.build();
            return new Typeface.CustomFallbackBuilder(build2).setStyle(h(build2, i13).getStyle()).build();
        } catch (Exception e13) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e13);
            return null;
        }
    }

    @Override // f5.o
    public final Typeface b(Context context, m5.g[] gVarArr, int i13) {
        try {
            FontFamily i14 = i(gVarArr, context.getContentResolver());
            if (i14 == null) {
                return null;
            }
            return new Typeface.CustomFallbackBuilder(i14).setStyle(h(i14, i13).getStyle()).build();
        } catch (Exception e13) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e13);
            return null;
        }
    }

    @Override // f5.o
    public final Typeface c(Context context, List list, int i13) {
        ContentResolver contentResolver = context.getContentResolver();
        try {
            FontFamily i14 = i((m5.g[]) list.get(0), contentResolver);
            if (i14 == null) {
                return null;
            }
            Typeface.CustomFallbackBuilder customFallbackBuilder = new Typeface.CustomFallbackBuilder(i14);
            for (int i15 = 1; i15 < list.size(); i15++) {
                FontFamily i16 = i((m5.g[]) list.get(i15), contentResolver);
                if (i16 != null) {
                    customFallbackBuilder.addCustomFallback(i16);
                }
            }
            return customFallbackBuilder.setStyle(h(i14, i13).getStyle()).build();
        } catch (Exception e13) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e13);
            return null;
        }
    }

    @Override // f5.o
    public final Typeface d(Context context, InputStream inputStream) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }

    @Override // f5.o
    public final Typeface e(Context context, Resources resources, int i13, String str, int i14) {
        try {
            Font build = new Font.Builder(resources, i13).build();
            return new Typeface.CustomFallbackBuilder(new FontFamily.Builder(build).build()).setStyle(build.getStyle()).build();
        } catch (Exception e13) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e13);
            return null;
        }
    }

    @Override // f5.o
    public final m5.g g(int i13, m5.g[] gVarArr) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }
}
