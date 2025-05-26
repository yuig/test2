package v52;

import android.os.Bundle;
import ao2.j0;
import com.pinterest.navigation.Navigation;
import com.pinterest.navigation.NavigationImpl;
import com.pinterest.share.board.video.screens.ShareBoardVideoLocation;
import dl2.j;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import u52.w0;
import u52.x0;
import u52.y0;

/* loaded from: classes4.dex */
public final class e extends j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ y0 f124180r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ w60.d f124181s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(y0 y0Var, w60.d dVar, bl2.c cVar) {
        super(2, cVar);
        this.f124180r = y0Var;
        this.f124181s = dVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new e(this.f124180r, this.f124181s, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((e) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        y0 y0Var = this.f124180r;
        boolean z13 = y0Var instanceof x0;
        w60.d dVar = this.f124181s;
        if (z13) {
            ll.j jVar = dVar.f128119b;
            NavigationImpl w13 = Navigation.w1(ShareBoardVideoLocation.SHARE_BOARD_PIN_SELECTION_SHEET);
            x0 x0Var = (x0) y0Var;
            w13.m0("com.pinterest.EXTRA_BOARD_ID", x0Var.f120747a);
            w13.m0("ARG_TEMPLATE_ID", x0Var.f120748b);
            w13.z(x0Var.f120749c, "ARG_TEMPLATE_MAX_PINS");
            w13.d("ARG_TEMPLATE_PINS", new ArrayList(x0Var.f120750d));
            Intrinsics.checkNotNullExpressionValue(w13, "apply(...)");
            jVar.f(w13);
        } else if (y0Var instanceof w0) {
            ll.j jVar2 = dVar.f128119b;
            Bundle bundle = new Bundle();
            w0 w0Var = (w0) y0Var;
            bundle.putString("ARG_TEMPLATE_ID", w0Var.f120741a);
            bundle.putStringArrayList("ARG_TEMPLATE_PINS", new ArrayList<>(w0Var.f120742b));
            Unit unit = Unit.f80348a;
            jVar2.E("com.pinterest.EXTRA_BOARD_PREVIEW_TEMPLATE_RESULT_CODE", bundle);
        }
        return Unit.f80348a;
    }
}
