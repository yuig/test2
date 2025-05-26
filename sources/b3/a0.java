package b3;

import android.graphics.ColorSpace;
import java.util.function.DoubleUnaryOperator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public abstract class a0 {
    @NotNull
    public static final ColorSpace a(@NotNull c3.d dVar) {
        float[] fArr;
        ColorSpace.Rgb.TransferParameters transferParameters;
        ColorSpace.Rgb rgb;
        float[] fArr2 = c3.f.f25492a;
        if (Intrinsics.d(dVar, c3.f.f25494c)) {
            return ColorSpace.get(ColorSpace.Named.SRGB);
        }
        if (Intrinsics.d(dVar, c3.f.f25506o)) {
            return ColorSpace.get(ColorSpace.Named.ACES);
        }
        if (Intrinsics.d(dVar, c3.f.f25507p)) {
            return ColorSpace.get(ColorSpace.Named.ACESCG);
        }
        if (Intrinsics.d(dVar, c3.f.f25504m)) {
            return ColorSpace.get(ColorSpace.Named.ADOBE_RGB);
        }
        if (Intrinsics.d(dVar, c3.f.f25499h)) {
            return ColorSpace.get(ColorSpace.Named.BT2020);
        }
        if (Intrinsics.d(dVar, c3.f.f25498g)) {
            return ColorSpace.get(ColorSpace.Named.BT709);
        }
        if (Intrinsics.d(dVar, c3.f.f25509r)) {
            return ColorSpace.get(ColorSpace.Named.CIE_LAB);
        }
        if (Intrinsics.d(dVar, c3.f.f25508q)) {
            return ColorSpace.get(ColorSpace.Named.CIE_XYZ);
        }
        if (Intrinsics.d(dVar, c3.f.f25500i)) {
            return ColorSpace.get(ColorSpace.Named.DCI_P3);
        }
        if (Intrinsics.d(dVar, c3.f.f25501j)) {
            return ColorSpace.get(ColorSpace.Named.DISPLAY_P3);
        }
        if (Intrinsics.d(dVar, c3.f.f25496e)) {
            return ColorSpace.get(ColorSpace.Named.EXTENDED_SRGB);
        }
        if (Intrinsics.d(dVar, c3.f.f25497f)) {
            return ColorSpace.get(ColorSpace.Named.LINEAR_EXTENDED_SRGB);
        }
        if (Intrinsics.d(dVar, c3.f.f25495d)) {
            return ColorSpace.get(ColorSpace.Named.LINEAR_SRGB);
        }
        if (Intrinsics.d(dVar, c3.f.f25502k)) {
            return ColorSpace.get(ColorSpace.Named.NTSC_1953);
        }
        if (Intrinsics.d(dVar, c3.f.f25505n)) {
            return ColorSpace.get(ColorSpace.Named.PRO_PHOTO_RGB);
        }
        if (Intrinsics.d(dVar, c3.f.f25503l)) {
            return ColorSpace.get(ColorSpace.Named.SMPTE_C);
        }
        if (!(dVar instanceof c3.s)) {
            return ColorSpace.get(ColorSpace.Named.SRGB);
        }
        c3.s sVar = (c3.s) dVar;
        float[] a13 = sVar.f25539d.a();
        c3.t h10 = sVar.h();
        if (h10 != null) {
            fArr = a13;
            transferParameters = new ColorSpace.Rgb.TransferParameters(h10.f25554b, h10.f25555c, h10.f25556d, h10.f25557e, h10.f25558f, h10.f25559g, h10.f25553a);
        } else {
            fArr = a13;
            transferParameters = null;
        }
        if (transferParameters != null) {
            rgb = new ColorSpace.Rgb(dVar.f25488a, ((c3.s) dVar).g(), fArr, transferParameters);
        } else {
            String str = dVar.f25488a;
            c3.s sVar2 = (c3.s) dVar;
            float[] g13 = sVar2.g();
            final int i13 = 0;
            final c3.r rVar = sVar2.f25547l;
            DoubleUnaryOperator doubleUnaryOperator = new DoubleUnaryOperator() { // from class: b3.y
                @Override // java.util.function.DoubleUnaryOperator
                public final double applyAsDouble(double d2) {
                    int i14 = i13;
                    Function1 function1 = rVar;
                    switch (i14) {
                    }
                    return ((Number) function1.invoke(Double.valueOf(d2))).doubleValue();
                }
            };
            final int i14 = 1;
            final c3.r rVar2 = sVar2.f25550o;
            rgb = new ColorSpace.Rgb(str, g13, fArr, doubleUnaryOperator, new DoubleUnaryOperator() { // from class: b3.y
                @Override // java.util.function.DoubleUnaryOperator
                public final double applyAsDouble(double d2) {
                    int i142 = i14;
                    Function1 function1 = rVar2;
                    switch (i142) {
                    }
                    return ((Number) function1.invoke(Double.valueOf(d2))).doubleValue();
                }
            }, dVar.b(0), dVar.a(0));
        }
        return rgb;
    }

    @NotNull
    public static final c3.d b(@NotNull final ColorSpace colorSpace) {
        c3.u uVar;
        ColorSpace.Rgb rgb;
        c3.t tVar;
        int id3 = colorSpace.getId();
        if (id3 == ColorSpace.Named.SRGB.ordinal()) {
            return c3.f.f25494c;
        }
        if (id3 == ColorSpace.Named.ACES.ordinal()) {
            return c3.f.f25506o;
        }
        if (id3 == ColorSpace.Named.ACESCG.ordinal()) {
            return c3.f.f25507p;
        }
        if (id3 == ColorSpace.Named.ADOBE_RGB.ordinal()) {
            return c3.f.f25504m;
        }
        if (id3 == ColorSpace.Named.BT2020.ordinal()) {
            return c3.f.f25499h;
        }
        if (id3 == ColorSpace.Named.BT709.ordinal()) {
            return c3.f.f25498g;
        }
        if (id3 == ColorSpace.Named.CIE_LAB.ordinal()) {
            return c3.f.f25509r;
        }
        if (id3 == ColorSpace.Named.CIE_XYZ.ordinal()) {
            return c3.f.f25508q;
        }
        if (id3 == ColorSpace.Named.DCI_P3.ordinal()) {
            return c3.f.f25500i;
        }
        if (id3 == ColorSpace.Named.DISPLAY_P3.ordinal()) {
            return c3.f.f25501j;
        }
        if (id3 == ColorSpace.Named.EXTENDED_SRGB.ordinal()) {
            return c3.f.f25496e;
        }
        if (id3 == ColorSpace.Named.LINEAR_EXTENDED_SRGB.ordinal()) {
            return c3.f.f25497f;
        }
        if (id3 == ColorSpace.Named.LINEAR_SRGB.ordinal()) {
            return c3.f.f25495d;
        }
        if (id3 == ColorSpace.Named.NTSC_1953.ordinal()) {
            return c3.f.f25502k;
        }
        if (id3 == ColorSpace.Named.PRO_PHOTO_RGB.ordinal()) {
            return c3.f.f25505n;
        }
        if (id3 == ColorSpace.Named.SMPTE_C.ordinal()) {
            return c3.f.f25503l;
        }
        if (!(colorSpace instanceof ColorSpace.Rgb)) {
            return c3.f.f25494c;
        }
        ColorSpace.Rgb rgb2 = (ColorSpace.Rgb) colorSpace;
        ColorSpace.Rgb.TransferParameters transferParameters = rgb2.getTransferParameters();
        if (rgb2.getWhitePoint().length == 3) {
            float f13 = rgb2.getWhitePoint()[0];
            float f14 = rgb2.getWhitePoint()[1];
            float f15 = f13 + f14 + rgb2.getWhitePoint()[2];
            uVar = new c3.u(f13 / f15, f14 / f15);
        } else {
            uVar = new c3.u(rgb2.getWhitePoint()[0], rgb2.getWhitePoint()[1]);
        }
        c3.u uVar2 = uVar;
        if (transferParameters != null) {
            rgb = rgb2;
            tVar = new c3.t(transferParameters.g, transferParameters.a, transferParameters.b, transferParameters.c, transferParameters.d, transferParameters.e, transferParameters.f);
        } else {
            rgb = rgb2;
            tVar = null;
        }
        final int i13 = 0;
        final int i14 = 1;
        return new c3.s(rgb.getName(), rgb.getPrimaries(), uVar2, rgb.getTransform(), new c3.k() { // from class: b3.z
            @Override // c3.k
            public final double i(double d2) {
                int i15 = i13;
                ColorSpace colorSpace2 = colorSpace;
                switch (i15) {
                    case 0:
                        return ((ColorSpace.Rgb) colorSpace2).getOetf().applyAsDouble(d2);
                    default:
                        return ((ColorSpace.Rgb) colorSpace2).getEotf().applyAsDouble(d2);
                }
            }
        }, new c3.k() { // from class: b3.z
            @Override // c3.k
            public final double i(double d2) {
                int i15 = i14;
                ColorSpace colorSpace2 = colorSpace;
                switch (i15) {
                    case 0:
                        return ((ColorSpace.Rgb) colorSpace2).getOetf().applyAsDouble(d2);
                    default:
                        return ((ColorSpace.Rgb) colorSpace2).getEotf().applyAsDouble(d2);
                }
            }
        }, colorSpace.getMinValue(0), colorSpace.getMaxValue(0), tVar, rgb.getId());
    }
}
