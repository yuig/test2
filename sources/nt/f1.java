package nt;

import android.text.Editable;
import com.pinterest.gestalt.textfield.view.GestaltTextField;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class f1 extends h1 {

    /* renamed from: c, reason: collision with root package name */
    public final GestaltTextField f92036c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f92037d;

    /* renamed from: e, reason: collision with root package name */
    public final h32.u0 f92038e;

    /* renamed from: f, reason: collision with root package name */
    public final do2.i f92039f;

    /* renamed from: g, reason: collision with root package name */
    public final String f92040g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f1(n1 questionId, GestaltTextField gestaltTextField, GestaltTextField gestaltTextField2, h32.u0 elementType, do2.c flow, String str) {
        super(questionId, gestaltTextField);
        Intrinsics.checkNotNullParameter(questionId, "questionId");
        Intrinsics.checkNotNullParameter(gestaltTextField2, "gestaltTextField");
        Intrinsics.checkNotNullParameter(elementType, "elementType");
        Intrinsics.checkNotNullParameter(flow, "flow");
        this.f92036c = gestaltTextField2;
        this.f92037d = false;
        this.f92038e = elementType;
        this.f92039f = flow;
        this.f92040g = str;
    }

    @Override // nt.h1
    public final String a() {
        String obj;
        Editable z03 = this.f92036c.z0();
        return (z03 == null || (obj = z03.toString()) == null) ? "" : obj;
    }

    @Override // nt.h1
    public final void b(String newData) {
        Intrinsics.checkNotNullParameter(newData, "newData");
        this.f92036c.X(new rq.l2(newData, 10));
    }
}
