package oa2;

import kh2.u2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class q extends kotlin.jvm.internal.s implements kl2.l {

    /* renamed from: j, reason: collision with root package name */
    public static final q f93949j = new q(0);

    /* renamed from: k, reason: collision with root package name */
    public static final q f93950k = new q(1);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f93951i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q(int i13) {
        super(3);
        this.f93951i = i13;
    }

    @Override // kl2.l
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i13 = this.f93951i;
        switch (i13) {
            case 0:
                nk1.h followState = (nk1.h) obj;
                yk1.v resources = (yk1.v) obj2;
                boolean booleanValue = ((Boolean) obj3).booleanValue();
                switch (i13) {
                    case 0:
                        Intrinsics.checkNotNullParameter(followState, "followState");
                        Intrinsics.checkNotNullParameter(resources, "resources");
                        return u2.P(followState, resources, booleanValue);
                    default:
                        Intrinsics.checkNotNullParameter(followState, "followState");
                        Intrinsics.checkNotNullParameter(resources, "resources");
                        return u2.P(followState, resources, false);
                }
            default:
                nk1.h followState2 = (nk1.h) obj;
                yk1.v resources2 = (yk1.v) obj2;
                boolean booleanValue2 = ((Boolean) obj3).booleanValue();
                switch (i13) {
                    case 0:
                        Intrinsics.checkNotNullParameter(followState2, "followState");
                        Intrinsics.checkNotNullParameter(resources2, "resources");
                        return u2.P(followState2, resources2, booleanValue2);
                    default:
                        Intrinsics.checkNotNullParameter(followState2, "followState");
                        Intrinsics.checkNotNullParameter(resources2, "resources");
                        return u2.P(followState2, resources2, false);
                }
        }
    }
}
