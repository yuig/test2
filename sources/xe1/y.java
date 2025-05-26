package xe1;

import com.pinterest.api.model.dk0;
import com.pinterest.framework.screens.ScreenLocation;
import com.pinterest.navigation.Navigation;
import com.pinterest.navigation.NavigationImpl;
import com.pinterest.screens.s4;
import h32.f1;
import h32.u0;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class y implements we1.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ oe1.b f134825a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function1 f134826b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ m60.w f134827c;

    public y(m60.w wVar, oe1.b bVar, Function1 function1) {
        this.f134825a = bVar;
        this.f134826b = function1;
        this.f134827c = wVar;
    }

    public final void a(String boardId, String boardName, int i13, u0 elementType, int i14, dk0 dk0Var) {
        String B;
        Intrinsics.checkNotNullParameter(boardId, "boardId");
        Intrinsics.checkNotNullParameter(boardName, "boardName");
        Intrinsics.checkNotNullParameter(elementType, "elementType");
        oe1.b bVar = this.f134825a;
        nx.d0 d0Var = bVar.f94266m;
        f1 f1Var = f1.TAP;
        HashMap hashMap = new HashMap();
        hashMap.put("index", String.valueOf(i13));
        hashMap.put("total_object_count", String.valueOf(i14));
        Unit unit = Unit.f80348a;
        c0.d.j2(d0Var, f1Var, boardId, (r16 & 8) != 0 ? null : null, (r16 & 16) != 0 ? null : elementType, bVar.f94272s, hashMap);
        if (dk0Var != null && (B = dk0Var.B()) != null && B.length() != 0) {
            this.f134826b.invoke(dk0Var);
            return;
        }
        NavigationImpl z03 = Navigation.z0((ScreenLocation) s4.f51354a.getValue(), boardId);
        z03.m0("com.pinterest.EXTRA_BOARD_ID", boardId);
        z03.z(x22.c.HF_STRUCTURED_FEED_STORY.getValue(), "com.pinterest.EXTRA_IDEAS_REFERRER_TYPE");
        z03.Y1("com.pinterest.EXTRA_IS_MORE_IDEAS_FROM_HOME_FEED_REFERRER", true);
        z03.m0("com.pinterest.EXTRA_BOARD_NAME", boardName);
        this.f134827c.d(z03);
    }
}
