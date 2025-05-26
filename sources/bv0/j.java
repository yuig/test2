package bv0;

import com.pinterest.framework.screens.ScreenLocation;
import com.pinterest.screens.d2;
import h32.u0;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.s;
import nx.d0;

/* loaded from: classes5.dex */
public final class j extends s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f23937i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ l f23938j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(l lVar, int i13) {
        super(0);
        this.f23937i = i13;
        this.f23938j = lVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.f23937i) {
            case 0:
                m77invoke();
                break;
            case 1:
                m77invoke();
                break;
            case 2:
                m77invoke();
                break;
            case 3:
                m77invoke();
                break;
            case 4:
                m77invoke();
                break;
            default:
                m77invoke();
                break;
        }
        return Unit.f80348a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m77invoke() {
        int i13 = this.f23937i;
        l lVar = this.f23938j;
        switch (i13) {
            case 0:
                av0.f.a2(lVar.f23949s, (ScreenLocation) d2.f50647h.getValue(), u0.STORY_PIN_ADVANCED_SETTING_SECTION, null, null, 28);
                break;
            case 1:
                av0.f.a2(lVar.f23949s, d2.a(), u0.STORY_PIN_BOARD_SECTION, null, null, 28);
                break;
            case 2:
                av0.f.a2(lVar.f23949s, d2.m(), u0.PIN_CREATION_EDITOR_BUTTON, null, ml1.b.MODAL_TRANSITION, 12);
                break;
            case 3:
                d0 d0Var = lVar.f23943m.f122379a;
                u0 u0Var = u0.STORY_PIN_METADATA_EDIT_COVER_BUTTON;
                d0Var.X(u0Var);
                av0.f.a2(lVar.f23949s, (ScreenLocation) d2.f50643d.getValue(), u0Var, null, null, 28);
                break;
            case 4:
                av0.f.a2(lVar.f23949s, (ScreenLocation) d2.f50654o.getValue(), u0.STORY_PIN_TAGS_SECTION, null, null, 28);
                break;
            default:
                ((dv0.k) lVar.f23949s).u3();
                break;
        }
    }
}
