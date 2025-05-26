package pu0;

import com.pinterest.api.model.fk;
import com.pinterest.api.model.wk;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.f0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public abstract class h {

    /* renamed from: a, reason: collision with root package name */
    public static final List f101389a = f0.j(a.Instant, a.FadeIn, a.SlideInLeft, a.SlideInRight, a.SlideInUp, a.SlideInDown, a.ScaleInUp, a.ScaleInDown, a.Spread, a.Expand);

    /* renamed from: b, reason: collision with root package name */
    public static final List f101390b = f0.j(b.Instant, b.FadeOut, b.SlideOutLeft, b.SlideOutRight, b.SlideOutUp, b.SlideOutDown, b.ScaleOutUp, b.ScaleOutDown, b.Shrink, b.Collapse);

    public static final a a(fk fkVar) {
        Intrinsics.checkNotNullParameter(fkVar, "<this>");
        switch (g.f101387a[fkVar.ordinal()]) {
            case 1:
                return a.Instant;
            case 2:
                return a.FadeIn;
            case 3:
                return a.Expand;
            case 4:
                return a.SlideInLeft;
            case 5:
                return a.SlideInRight;
            case 6:
                return a.SlideInUp;
            case 7:
                return a.SlideInDown;
            case 8:
                return a.Spread;
            case 9:
                return a.ScaleInUp;
            case 10:
                return a.ScaleInDown;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final b b(wk wkVar) {
        Intrinsics.checkNotNullParameter(wkVar, "<this>");
        switch (g.f101388b[wkVar.ordinal()]) {
            case 1:
                return b.Instant;
            case 2:
                return b.FadeOut;
            case 3:
                return b.Shrink;
            case 4:
                return b.SlideOutLeft;
            case 5:
                return b.SlideOutRight;
            case 6:
                return b.SlideOutDown;
            case 7:
                return b.SlideOutUp;
            case 8:
                return b.Collapse;
            case 9:
                return b.ScaleOutUp;
            case 10:
                return b.ScaleOutDown;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
