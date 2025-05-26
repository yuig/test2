package rh1;

import android.os.Handler;
import android.os.Looper;
import com.pinterest.navigation.Navigation;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import so.e6;
import so.t6;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0017\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lrh1/h2;", "Lrh1/k;", "<init>", "()V", "comments_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public class h2 extends f1 {

    /* renamed from: p1, reason: collision with root package name */
    public static final /* synthetic */ int f108155p1 = 0;

    /* renamed from: l1, reason: collision with root package name */
    public t6 f108156l1;

    /* renamed from: m1, reason: collision with root package name */
    public e6 f108157m1;

    /* renamed from: n1, reason: collision with root package name */
    public final Handler f108158n1 = new Handler(Looper.getMainLooper());

    /* renamed from: o1, reason: collision with root package name */
    public boolean f108159o1;

    @Override // yk1.k
    public final yk1.m V7() {
        t6 t6Var = this.f108156l1;
        if (t6Var == null) {
            Intrinsics.r("unifiedCommentsPresenterFactory");
            throw null;
        }
        Navigation navigation = this.I;
        String f49940b = navigation != null ? navigation.getF49940b() : null;
        if (f49940b == null) {
            throw new IllegalStateException("Aggregated pin data ID is required");
        }
        String pinUid = getPinUid();
        Navigation navigation2 = this.I;
        String v03 = navigation2 != null ? navigation2.v0("com.pinterest.EXTRA_USER_ID") : null;
        String str = v03 == null ? "" : v03;
        Navigation navigation3 = this.I;
        String v04 = navigation3 != null ? navigation3.v0("com.pinterest.EXTRA_USERNAME") : null;
        String str2 = v04 == null ? "" : v04;
        String b93 = b9();
        Navigation navigation4 = this.I;
        String v05 = navigation4 != null ? navigation4.v0("com.pinterest.EXTRA_COMMENT_TYPE") : null;
        String str3 = v05 == null ? "" : v05;
        Navigation navigation5 = this.I;
        String v06 = navigation5 != null ? navigation5.v0("com.pinterest.EXTRA_REPLY_ID") : null;
        if (v06 == null) {
            v06 = "";
        }
        Navigation navigation6 = this.I;
        String v07 = navigation6 != null ? navigation6.v0("com.pinterest.EXTRA_COMPOSE_REPLY_TO_COMMENT_ID") : null;
        if (v07 == null) {
            v07 = "";
        }
        Navigation navigation7 = this.I;
        String v08 = navigation7 != null ? navigation7.v0("com.pinterest.EXTRA_COMPOSE_REPLY_TO_COMMENT_TYPE") : null;
        if (v08 == null) {
            v08 = "";
        }
        Navigation navigation8 = this.I;
        String v09 = navigation8 != null ? navigation8.v0("com.pinterest.EXTRA_COMPOSE_REPLY_TO_USER_ID") : null;
        if (v09 == null) {
            v09 = "";
        }
        Navigation navigation9 = this.I;
        String v010 = navigation9 != null ? navigation9.v0("com.pinterest.EXTRA_COMPOSE_REPLY_TO_USER_NAME") : null;
        String str4 = v010 == null ? "" : v010;
        Navigation navigation10 = this.I;
        boolean S = navigation10 != null ? navigation10.S("com.pinterest.EXTRA_PIN_DONE_BY_ME", false) : false;
        Navigation navigation11 = this.I;
        boolean z13 = S;
        boolean S2 = navigation11 != null ? navigation11.S("com.pinterest.EXTRA_PIN_ELIGIBLE_FOR_TRIED_IT", false) : false;
        Navigation navigation12 = this.I;
        String v011 = navigation12 != null ? navigation12.v0("com.pinterest.EXTRA_REPLY_ID") : null;
        if (v011 == null) {
            v011 = b9();
        }
        String str5 = v011;
        Navigation navigation13 = this.I;
        return t6Var.a(new nh1.a(pinUid, f49940b, str, b93, str2, str3, v06, v07, v08, v09, str4, z13, S2, str5, null, null, null, navigation13 != null ? navigation13.v0("com.pinterest.EXTRA_COMMENT_PARENT_PAIR_ID") : null, Integer.valueOf(this.f108197c1), 1007616));
    }

    @Override // rh1.k
    public final void e9(String commentId, String commentType, boolean z13) {
        Intrinsics.checkNotNullParameter(commentId, "commentId");
        Intrinsics.checkNotNullParameter(commentType, "commentType");
        m60.w f73 = f7();
        e6 e6Var = this.f108157m1;
        if (e6Var != null) {
            f73.d(new jc0.v(h1.a(e6Var, new rp0.a(commentId, commentType, z13, getS0())), false, 0L, 30));
        } else {
            Intrinsics.r("commentReactionListModalFactory");
            throw null;
        }
    }

    @Override // yq0.t, ml1.q
    public void k5() {
        super.k5();
        this.f108158n1.postDelayed(new s81.g(this, 11), 500L);
    }
}
