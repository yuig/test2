package ou0;

import com.pinterest.feature.ideaPinCreation.closeup.view.a0;
import com.pinterest.feature.ideaPinCreation.drawing.IdeaPinHandDrawingEditor;
import com.pinterest.feature.ideaPinCreation.drawing.IdeaPinHandDrawingView;
import h32.d4;
import h32.u0;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.collections.k0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* loaded from: classes5.dex */
public final class g extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f97709i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ IdeaPinHandDrawingEditor f97710j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(IdeaPinHandDrawingEditor ideaPinHandDrawingEditor, int i13) {
        super(1);
        this.f97709i = i13;
        this.f97710j = ideaPinHandDrawingEditor;
    }

    public final void b(om1.l it) {
        n nVar;
        int i13 = this.f97709i;
        IdeaPinHandDrawingEditor ideaPinHandDrawingEditor = this.f97710j;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(it, "it");
                int i14 = IdeaPinHandDrawingEditor.A;
                IdeaPinHandDrawingView ideaPinHandDrawingView = ideaPinHandDrawingEditor.f46483a;
                if (ideaPinHandDrawingView != null) {
                    ArrayList arrayList = ideaPinHandDrawingView.f46517i;
                    arrayList.clear();
                    arrayList.addAll(ideaPinHandDrawingView.f46516h);
                    ideaPinHandDrawingView.invalidate();
                }
                if (ideaPinHandDrawingEditor.f46508z) {
                    bs1.c.X0(ideaPinHandDrawingEditor);
                }
                IdeaPinHandDrawingView ideaPinHandDrawingView2 = ideaPinHandDrawingEditor.f46483a;
                if (ideaPinHandDrawingView2 != null) {
                    ideaPinHandDrawingView2.f46514f = false;
                }
                j jVar = ideaPinHandDrawingEditor.f46505w;
                if (jVar != null) {
                    jVar.b(false);
                    break;
                }
                break;
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                IdeaPinHandDrawingView ideaPinHandDrawingView3 = ideaPinHandDrawingEditor.f46483a;
                if (ideaPinHandDrawingView3 != null) {
                    ArrayList arrayList2 = ideaPinHandDrawingView3.f46517i;
                    k0.C(arrayList2);
                    ideaPinHandDrawingView3.invalidate();
                    if (arrayList2.isEmpty() && (nVar = ideaPinHandDrawingView3.f46518j) != null) {
                        ((IdeaPinHandDrawingEditor) nVar).f46484b.t(i.f97713k);
                    }
                }
                a0 a0Var = ideaPinHandDrawingEditor.f46507y;
                if (a0Var != null) {
                    a0.a(a0Var, u0.STORY_PIN_DRAWING_UNDO_BUTTON, d4.STORY_PIN_PAGE_DRAWING_TOOL);
                    break;
                }
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f97709i) {
            case 0:
                b((om1.l) obj);
                break;
            default:
                b((om1.l) obj);
                break;
        }
        return Unit.f80348a;
    }
}
