package ua;

import android.view.View;
import androidx.transition.Transition;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class r implements o0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ View f121346a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ArrayList f121347b;

    public r(View view, ArrayList arrayList) {
        this.f121346a = view;
        this.f121347b = arrayList;
    }

    @Override // ua.o0
    public final void a() {
    }

    @Override // ua.o0
    public final void d() {
    }

    @Override // ua.o0
    public final void e(Transition transition) {
        transition.I(this);
        transition.a(this);
    }

    @Override // ua.o0
    public final void f(Transition transition) {
        transition.I(this);
        this.f121346a.setVisibility(8);
        ArrayList arrayList = this.f121347b;
        int size = arrayList.size();
        for (int i13 = 0; i13 < size; i13++) {
            ((View) arrayList.get(i13)).setVisibility(0);
        }
    }

    @Override // ua.o0
    public final void g(Transition transition) {
    }
}
