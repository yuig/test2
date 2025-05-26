package sf1;

import com.pinterest.api.model.zk0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final float f112624a;

    /* renamed from: b, reason: collision with root package name */
    public final float f112625b;

    /* renamed from: c, reason: collision with root package name */
    public final int f112626c;

    /* renamed from: d, reason: collision with root package name */
    public final int f112627d;

    /* renamed from: e, reason: collision with root package name */
    public final float f112628e;

    /* renamed from: f, reason: collision with root package name */
    public final float f112629f;

    public j(s sVar, zk0 blockStyle) {
        Intrinsics.checkNotNullParameter(blockStyle, "blockStyle");
        Double k13 = blockStyle.k();
        Intrinsics.checkNotNullExpressionValue(k13, "getXCoord(...)");
        float w13 = c0.d.w(k13.doubleValue(), sVar.f112699f);
        Double l13 = blockStyle.l();
        Intrinsics.checkNotNullExpressionValue(l13, "getYCoord(...)");
        float w14 = c0.d.w(l13.doubleValue(), sVar.f112700g);
        Double j13 = blockStyle.j();
        Intrinsics.checkNotNullExpressionValue(j13, "getWidth(...)");
        int x13 = c0.d.x(j13.doubleValue(), sVar.f112699f);
        Double h10 = blockStyle.h();
        Intrinsics.checkNotNullExpressionValue(h10, "getHeight(...)");
        int x14 = c0.d.x(h10.doubleValue(), sVar.f112700g);
        float doubleValue = (float) blockStyle.i().doubleValue();
        float doubleValue2 = (float) blockStyle.g().doubleValue();
        this.f112624a = w13;
        this.f112625b = w14;
        this.f112626c = x13;
        this.f112627d = x14;
        this.f112628e = doubleValue;
        this.f112629f = doubleValue2;
    }
}
