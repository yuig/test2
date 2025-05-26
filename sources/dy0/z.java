package dy0;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class z extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final z f56626j = new z(0);

    /* renamed from: k, reason: collision with root package name */
    public static final z f56627k = new z(1);

    /* renamed from: l, reason: collision with root package name */
    public static final z f56628l = new z(2);

    /* renamed from: m, reason: collision with root package name */
    public static final z f56629m = new z(3);

    /* renamed from: n, reason: collision with root package name */
    public static final z f56630n = new z(4);

    /* renamed from: o, reason: collision with root package name */
    public static final z f56631o = new z(5);

    /* renamed from: p, reason: collision with root package name */
    public static final z f56632p = new z(6);

    /* renamed from: q, reason: collision with root package name */
    public static final z f56633q = new z(7);

    /* renamed from: r, reason: collision with root package name */
    public static final z f56634r = new z(8);

    /* renamed from: s, reason: collision with root package name */
    public static final z f56635s = new z(9);

    /* renamed from: t, reason: collision with root package name */
    public static final z f56636t = new z(10);

    /* renamed from: u, reason: collision with root package name */
    public static final z f56637u = new z(11);

    /* renamed from: v, reason: collision with root package name */
    public static final z f56638v = new z(12);

    /* renamed from: w, reason: collision with root package name */
    public static final z f56639w = new z(13);

    /* renamed from: x, reason: collision with root package name */
    public static final z f56640x = new z(14);

    /* renamed from: y, reason: collision with root package name */
    public static final z f56641y = new z(15);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f56642i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z(int i13) {
        super(1);
        this.f56642i = i13;
    }

    public final Float b(p0 shuffleAnimationFloat) {
        switch (this.f56642i) {
            case 2:
                Intrinsics.checkNotNullParameter(shuffleAnimationFloat, "$this$shuffleAnimationFloat");
                return Float.valueOf(shuffleAnimationFloat.getPin2VerticalOffsetPercent());
            case 3:
                Intrinsics.checkNotNullParameter(shuffleAnimationFloat, "$this$shuffleAnimationFloat");
                return Float.valueOf(shuffleAnimationFloat.getPin3WidthPercent());
            case 4:
                Intrinsics.checkNotNullParameter(shuffleAnimationFloat, "$this$shuffleAnimationFloat");
                return Float.valueOf(shuffleAnimationFloat.getPin3RotationDegrees());
            case 5:
                Intrinsics.checkNotNullParameter(shuffleAnimationFloat, "$this$shuffleAnimationFloat");
                return Float.valueOf(shuffleAnimationFloat.getPin3ZIndex());
            case 6:
                Intrinsics.checkNotNullParameter(shuffleAnimationFloat, "$this$shuffleAnimationFloat");
                return Float.valueOf(shuffleAnimationFloat.getPin3HorizontalBias());
            case 7:
                Intrinsics.checkNotNullParameter(shuffleAnimationFloat, "$this$shuffleAnimationFloat");
                return Float.valueOf(shuffleAnimationFloat.getPin1WidthPercent());
            case 8:
                Intrinsics.checkNotNullParameter(shuffleAnimationFloat, "$this$shuffleAnimationFloat");
                return Float.valueOf(shuffleAnimationFloat.getPin1RotationDegrees());
            case 9:
                Intrinsics.checkNotNullParameter(shuffleAnimationFloat, "$this$shuffleAnimationFloat");
                return Float.valueOf(shuffleAnimationFloat.getPin1ZIndex());
            case 10:
                Intrinsics.checkNotNullParameter(shuffleAnimationFloat, "$this$shuffleAnimationFloat");
                return Float.valueOf(shuffleAnimationFloat.getPin1HorizontalBias());
            case 11:
                Intrinsics.checkNotNullParameter(shuffleAnimationFloat, "$this$shuffleAnimationFloat");
                return Float.valueOf(shuffleAnimationFloat.getPin2WidthPercent());
            case 12:
                Intrinsics.checkNotNullParameter(shuffleAnimationFloat, "$this$shuffleAnimationFloat");
                return Float.valueOf(shuffleAnimationFloat.getPin2RotationDegrees());
            case 13:
                Intrinsics.checkNotNullParameter(shuffleAnimationFloat, "$this$shuffleAnimationFloat");
                return Float.valueOf(shuffleAnimationFloat.getPin2ZIndex());
            default:
                Intrinsics.checkNotNullParameter(shuffleAnimationFloat, "$this$shuffleAnimationFloat");
                return Float.valueOf(shuffleAnimationFloat.getPin2HorizontalBias());
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f56642i;
        switch (i13) {
            case 0:
                int intValue = ((Number) obj).intValue();
                switch (i13) {
                    case 0:
                        return Integer.valueOf(intValue);
                    default:
                        return Integer.valueOf(-intValue);
                }
            case 1:
                int intValue2 = ((Number) obj).intValue();
                switch (i13) {
                    case 0:
                        return Integer.valueOf(intValue2);
                    default:
                        return Integer.valueOf(-intValue2);
                }
            case 2:
                return b((p0) obj);
            case 3:
                return b((p0) obj);
            case 4:
                return b((p0) obj);
            case 5:
                return b((p0) obj);
            case 6:
                return b((p0) obj);
            case 7:
                return b((p0) obj);
            case 8:
                return b((p0) obj);
            case 9:
                return b((p0) obj);
            case 10:
                return b((p0) obj);
            case 11:
                return b((p0) obj);
            case 12:
                return b((p0) obj);
            case 13:
                return b((p0) obj);
            case 14:
                return b((p0) obj);
            default:
                e it = (e) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                return e.e(it, null, null, 62);
        }
    }
}
