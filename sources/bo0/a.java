package bo0;

import ac1.i;
import co0.d;
import com.pinterest.feature.settings.notifications.y0;
import h90.m;
import j12.k;
import java.util.ArrayList;
import jk2.j1;
import kl0.t;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import lb0.r;
import lh0.q3;
import lh0.t3;
import ll.j;
import n00.b;
import q91.h;
import tk2.e;
import uj2.q;
import va1.f;
import va1.m1;
import x02.x2;
import xk1.c;

/* loaded from: classes5.dex */
public final class a extends c {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f23600k = 0;

    /* renamed from: l, reason: collision with root package name */
    public final Object f23601l;

    /* renamed from: m, reason: collision with root package name */
    public final Object f23602m;

    /* renamed from: n, reason: collision with root package name */
    public final Object f23603n;

    /* renamed from: o, reason: collision with root package name */
    public final Object f23604o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(k boardSectionService, String boardId, String sourceSectionId, d listener) {
        super(null);
        Intrinsics.checkNotNullParameter(boardSectionService, "boardSectionService");
        Intrinsics.checkNotNullParameter(boardId, "boardId");
        Intrinsics.checkNotNullParameter(sourceSectionId, "sourceSectionId");
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f23601l = boardSectionService;
        this.f23602m = boardId;
        this.f23603n = sourceSectionId;
        this.f23604o = listener;
        o(2131232, new m(this, 6));
    }

    @Override // sq0.e0
    public final int getItemViewType(int i13) {
        f fVar;
        ArrayList arrayList = this.f135191h;
        switch (this.f23600k) {
            case 0:
                return 2131232;
            case 1:
                Object obj = CollectionsKt.F0(arrayList).get(i13);
                fVar = obj instanceof sa1.c ? (sa1.c) obj : null;
                if (fVar != null) {
                    return ((m1) fVar).f125212g;
                }
                throw new IllegalStateException("Item should be LoginOptionsMenuItem");
            default:
                Object obj2 = CollectionsKt.F0(arrayList).get(i13);
                fVar = obj2 instanceof i ? (i) obj2 : null;
                if (fVar != null) {
                    return fVar.getViewType();
                }
                throw new IllegalStateException("Item should be PersonalInformationMenuItem");
        }
    }

    @Override // xk1.c
    public final q k() {
        int i13 = 0;
        int i14 = this.f23600k;
        int i15 = 22;
        Object obj = this.f23601l;
        switch (i14) {
            case 0:
                j1 j1Var = new j1(((k) obj).d((String) this.f23602m, b.a(n00.c.BOARD_SECTION_SUMMARY)).l(wj2.c.a()).r(e.f118017c).u(), new qk0.b(6, new t(this, i15)), i13);
                Intrinsics.checkNotNullExpressionValue(j1Var, "map(...)");
                return j1Var;
            case 1:
                x2 d03 = ((x2) obj).d0();
                String uid = com.bumptech.glide.d.Q((b60.b) this.f23603n).getUid();
                Intrinsics.checkNotNullExpressionValue(uid, "getUid(...)");
                j1 j1Var2 = new j1(d03.L(uid).I(1L), new t81.a(17, new h(this, 23)), i13);
                Intrinsics.checkNotNullExpressionValue(j1Var2, "map(...)");
                return j1Var2;
            default:
                j1 j1Var3 = new j1(((x2) obj).d0().Q("me").I(1L), new t81.a(27, new y0(this, 22)), i13);
                Intrinsics.checkNotNullExpressionValue(j1Var3, "map(...)");
                return j1Var3;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(x2 userRepository, t3 experiments, b60.b activeUserManager, gz1.b googlePlayServices) {
        super(null);
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        Intrinsics.checkNotNullParameter(experiments, "experiments");
        Intrinsics.checkNotNullParameter(activeUserManager, "activeUserManager");
        Intrinsics.checkNotNullParameter(googlePlayServices, "googlePlayServices");
        this.f23601l = userRepository;
        this.f23602m = experiments;
        this.f23603n = activeUserManager;
        this.f23604o = googlePlayServices;
        o(3, new s91.b(4));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(x2 userRepository, j settingsTextUtils, q3 experiments, r prefsManagerUser) {
        super(null);
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        Intrinsics.checkNotNullParameter(settingsTextUtils, "settingsTextUtils");
        Intrinsics.checkNotNullParameter(experiments, "experiments");
        Intrinsics.checkNotNullParameter(prefsManagerUser, "prefsManagerUser");
        this.f23601l = userRepository;
        this.f23602m = settingsTextUtils;
        this.f23603n = experiments;
        this.f23604o = prefsManagerUser;
        o(0, new s91.b(29));
        o(1, new ac1.j(0));
        o(2, new ac1.j(1));
    }
}
