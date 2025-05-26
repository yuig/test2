package com.google.android.material.internal;

import android.view.SubMenu;

/* loaded from: classes3.dex */
public final class i extends n.o {
    @Override // n.o, android.view.Menu
    public final SubMenu addSubMenu(int i13, int i14, int i15, CharSequence charSequence) {
        n.q a13 = a(i13, i14, i15, charSequence);
        u uVar = new u(this.f88648a, this, a13);
        a13.f88689o = uVar;
        uVar.setHeaderTitle(a13.f88679e);
        return uVar;
    }
}
