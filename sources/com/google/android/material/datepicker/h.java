package com.google.android.material.datepicker;

import android.content.Context;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import com.pinterest.feature.pin.edit.view.AttributeInputTextViewLegacy;
import com.pinterest.feature.search.results.view.SearchBarView;
import com.pinterest.gestalt.textfield.view.GestaltTextField;
import h32.u0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import lq0.o0;

/* loaded from: classes3.dex */
public final /* synthetic */ class h implements View.OnFocusChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f32532a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f32533b;

    public /* synthetic */ h(Object obj, int i13) {
        this.f32532a = i13;
        this.f32533b = obj;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z13) {
        int i13 = this.f32532a;
        int i14 = 0;
        Object obj = this.f32533b;
        switch (i13) {
            case 0:
                for (EditText editText : (EditText[]) obj) {
                    if (editText.hasFocus()) {
                        return;
                    }
                }
                Context context = view.getContext();
                Object obj2 = d5.a.f53679a;
                InputMethodManager inputMethodManager = (InputMethodManager) context.getSystemService(InputMethodManager.class);
                if (inputMethodManager != null) {
                    inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(), 0);
                    return;
                }
                return;
            case 1:
                com.google.android.material.textfield.k kVar = (com.google.android.material.textfield.k) obj;
                kVar.f33241l = z13;
                kVar.q();
                if (z13) {
                    return;
                }
                kVar.t(false);
                kVar.f33242m = false;
                return;
            case 2:
                fk0.k this$0 = (fk0.k) obj;
                int i15 = fk0.k.L0;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                if (z13) {
                    GestaltTextField gestaltTextField = this$0.f62302r0;
                    if (gestaltTextField != null) {
                        hf0.b.s(gestaltTextField);
                        return;
                    } else {
                        Intrinsics.r("boardNameEt");
                        throw null;
                    }
                }
                GestaltTextField gestaltTextField2 = this$0.f62302r0;
                if (gestaltTextField2 == null) {
                    Intrinsics.r("boardNameEt");
                    throw null;
                }
                ph.a.p(gestaltTextField2, new fk0.j(this$0, i14));
                GestaltTextField gestaltTextField3 = this$0.f62302r0;
                if (gestaltTextField3 != null) {
                    hf0.b.k(gestaltTextField3);
                    return;
                } else {
                    Intrinsics.r("boardNameEt");
                    throw null;
                }
            case 3:
                o0 this$02 = (o0) obj;
                int i16 = o0.R1;
                Intrinsics.checkNotNullParameter(this$02, "this$0");
                aq0.e eVar = this$02.M0;
                if (eVar != null) {
                    ((dq0.p) eVar).L3(z13);
                    return;
                }
                return;
            case 4:
                ev0.s this$03 = (ev0.s) obj;
                int i17 = ev0.s.f60273l;
                Intrinsics.checkNotNullParameter(this$03, "this$0");
                if (z13) {
                    ((uk1.d) this$03.f60280j.f56383d).f122379a.X(u0.IDEA_PIN_LINK_SECTION);
                    return;
                } else {
                    this$03.Z();
                    return;
                }
            case 5:
                Function1 focusChangedListener = (Function1) obj;
                int i18 = AttributeInputTextViewLegacy.f47197g;
                Intrinsics.checkNotNullParameter(focusChangedListener, "$focusChangedListener");
                focusChangedListener.invoke(Boolean.valueOf(z13));
                return;
            default:
                SearchBarView searchBarView = (SearchBarView) obj;
                if (z13) {
                    hf0.b.s(searchBarView.f47686c);
                } else {
                    hf0.b.k(searchBarView.f47686c);
                }
                searchBarView.c(!z13);
                return;
        }
    }
}
