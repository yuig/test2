package t3;

import android.view.DragEvent;
import android.view.View;
import androidx.compose.ui.platform.DragAndDropModifierOnDragListener$modifier$1;
import t3.l2;
import u2.p;

/* loaded from: classes.dex */
public final class l2 implements View.OnDragListener {

    /* renamed from: a, reason: collision with root package name */
    public final x2.e f116073a = new x2.e();

    /* renamed from: b, reason: collision with root package name */
    public final g1.h f116074b = new g1.h(0);

    /* renamed from: c, reason: collision with root package name */
    public final DragAndDropModifierOnDragListener$modifier$1 f116075c = new s3.e1() { // from class: androidx.compose.ui.platform.DragAndDropModifierOnDragListener$modifier$1
        public final boolean equals(Object obj) {
            return obj == this;
        }

        public final int hashCode() {
            return l2.this.f116073a.hashCode();
        }

        @Override // s3.e1
        public final p l() {
            return l2.this.f116073a;
        }

        @Override // s3.e1
        public final /* bridge */ /* synthetic */ void m(p pVar) {
        }
    };

    @Override // android.view.View.OnDragListener
    public final boolean onDrag(View view, DragEvent dragEvent) {
        x2.b bVar = new x2.b(dragEvent);
        int action = dragEvent.getAction();
        x2.e eVar = this.f116073a;
        switch (action) {
            case 1:
                eVar.getClass();
                kotlin.jvm.internal.f0 f0Var = new kotlin.jvm.internal.f0();
                kh2.w.o(eVar, new e.f(bVar, eVar, f0Var, 11));
                boolean z13 = f0Var.f80424a;
                g1.h hVar = this.f116074b;
                hVar.getClass();
                g1.f fVar = new g1.f(hVar);
                while (fVar.hasNext()) {
                    ((x2.e) ((x2.c) fVar.next())).Q0(bVar);
                }
                break;
            case 2:
                eVar.P0(bVar);
                break;
            case 4:
                eVar.getClass();
                kh2.w.o(eVar, new q0.e(bVar, 23));
                break;
            case 5:
                eVar.N0(bVar);
                break;
            case 6:
                eVar.O0(bVar);
                break;
        }
        return false;
    }
}
