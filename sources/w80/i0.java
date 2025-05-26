package w80;

import com.pinterest.feature.ideaPinCreation.drawing.IdeaPinHandDrawingEditor;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class i0 extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f128305i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ s80.j f128306j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i0(s80.j jVar, int i13) {
        super(1);
        this.f128305i = i13;
        this.f128306j = jVar;
    }

    public final void b(IdeaPinHandDrawingEditor editor) {
        int i13 = this.f128305i;
        s80.j jVar = this.f128306j;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(editor, "editor");
                boolean z13 = !jVar.f111596e.f111806b;
                editor.getClass();
                if (z13) {
                    kg.a.s(editor, 0L, null, 6);
                } else {
                    kg.a.u(editor, 0, 0L, 6);
                }
                editor.m(jVar.f111600i.f111831a);
                break;
            default:
                Intrinsics.checkNotNullParameter(editor, "editor");
                editor.m(jVar.f111600i.f111831a);
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f128305i) {
            case 0:
                b((IdeaPinHandDrawingEditor) obj);
                break;
            default:
                b((IdeaPinHandDrawingEditor) obj);
                break;
        }
        return Unit.f80348a;
    }
}
