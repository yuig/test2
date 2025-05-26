package r52;

import a.cb;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import l82.i0;
import o82.j0;
import zy.l0;

/* loaded from: classes4.dex */
public final class d0 implements i0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f106274a;

    /* renamed from: b, reason: collision with root package name */
    public final String f106275b;

    /* renamed from: c, reason: collision with root package name */
    public final j0 f106276c;

    /* renamed from: d, reason: collision with root package name */
    public final l0 f106277d;

    /* renamed from: e, reason: collision with root package name */
    public final int f106278e;

    /* renamed from: f, reason: collision with root package name */
    public final List f106279f;

    /* renamed from: g, reason: collision with root package name */
    public final List f106280g;

    public d0(String boardId, String templateId, j0 sectionVMState, l0 pinalyticsVMState, int i13, List selectedPins, List initialSelection) {
        Intrinsics.checkNotNullParameter(boardId, "boardId");
        Intrinsics.checkNotNullParameter(templateId, "templateId");
        Intrinsics.checkNotNullParameter(sectionVMState, "sectionVMState");
        Intrinsics.checkNotNullParameter(pinalyticsVMState, "pinalyticsVMState");
        Intrinsics.checkNotNullParameter(selectedPins, "selectedPins");
        Intrinsics.checkNotNullParameter(initialSelection, "initialSelection");
        this.f106274a = boardId;
        this.f106275b = templateId;
        this.f106276c = sectionVMState;
        this.f106277d = pinalyticsVMState;
        this.f106278e = i13;
        this.f106279f = selectedPins;
        this.f106280g = initialSelection;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v2, types: [java.util.List] */
    public static d0 b(d0 d0Var, j0 j0Var, l0 l0Var, List list, ArrayList arrayList, int i13) {
        String boardId = d0Var.f106274a;
        String templateId = d0Var.f106275b;
        if ((i13 & 4) != 0) {
            j0Var = d0Var.f106276c;
        }
        j0 sectionVMState = j0Var;
        if ((i13 & 8) != 0) {
            l0Var = d0Var.f106277d;
        }
        l0 pinalyticsVMState = l0Var;
        int i14 = d0Var.f106278e;
        if ((i13 & 32) != 0) {
            list = d0Var.f106279f;
        }
        List selectedPins = list;
        ArrayList arrayList2 = arrayList;
        if ((i13 & 64) != 0) {
            arrayList2 = d0Var.f106280g;
        }
        ArrayList initialSelection = arrayList2;
        d0Var.getClass();
        Intrinsics.checkNotNullParameter(boardId, "boardId");
        Intrinsics.checkNotNullParameter(templateId, "templateId");
        Intrinsics.checkNotNullParameter(sectionVMState, "sectionVMState");
        Intrinsics.checkNotNullParameter(pinalyticsVMState, "pinalyticsVMState");
        Intrinsics.checkNotNullParameter(selectedPins, "selectedPins");
        Intrinsics.checkNotNullParameter(initialSelection, "initialSelection");
        return new d0(boardId, templateId, sectionVMState, pinalyticsVMState, i14, selectedPins, initialSelection);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d0)) {
            return false;
        }
        d0 d0Var = (d0) obj;
        return Intrinsics.d(this.f106274a, d0Var.f106274a) && Intrinsics.d(this.f106275b, d0Var.f106275b) && Intrinsics.d(this.f106276c, d0Var.f106276c) && Intrinsics.d(this.f106277d, d0Var.f106277d) && this.f106278e == d0Var.f106278e && Intrinsics.d(this.f106279f, d0Var.f106279f) && Intrinsics.d(this.f106280g, d0Var.f106280g);
    }

    public final int hashCode() {
        return this.f106280g.hashCode() + ep.b.c(this.f106279f, ep.b.b(this.f106278e, jq.b.a(this.f106277d, ep.b.c(this.f106276c.f93634a, cb.d(this.f106275b, this.f106274a.hashCode() * 31, 31), 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("ShareBoardPinSelectionSheetVMState(boardId=");
        sb3.append(this.f106274a);
        sb3.append(", templateId=");
        sb3.append(this.f106275b);
        sb3.append(", sectionVMState=");
        sb3.append(this.f106276c);
        sb3.append(", pinalyticsVMState=");
        sb3.append(this.f106277d);
        sb3.append(", maxPinCount=");
        sb3.append(this.f106278e);
        sb3.append(", selectedPins=");
        sb3.append(this.f106279f);
        sb3.append(", initialSelection=");
        return a.c.j(sb3, this.f106280g, ")");
    }
}
