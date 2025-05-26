package com.pinterest.feature.ideaPinCreation.closeup.view;

import android.text.Editable;
import android.text.TextWatcher;
import com.pinterest.gestalt.text.GestaltText;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class h2 implements TextWatcher {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ IdeaPinTextEditor f46195a;

    public h2(IdeaPinTextEditor ideaPinTextEditor) {
        this.f46195a = ideaPinTextEditor;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable text) {
        Intrinsics.checkNotNullParameter(text, "text");
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence s13, int i13, int i14, int i15) {
        Intrinsics.checkNotNullParameter(s13, "s");
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence s13, int i13, int i14, int i15) {
        Intrinsics.checkNotNullParameter(s13, "s");
        IdeaPinTextEditor ideaPinTextEditor = this.f46195a;
        GestaltText gestaltText = ideaPinTextEditor.f46044j;
        String string = ideaPinTextEditor.getResources().getString(aq1.h.idea_pin_text_count, Integer.valueOf(s13.length()), Integer.valueOf(ideaPinTextEditor.f46041g));
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        pk.a0.p(gestaltText, string);
    }
}
