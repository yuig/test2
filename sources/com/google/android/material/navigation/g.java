package com.google.android.material.navigation;

import android.content.Context;
import android.view.SubMenu;
import n.o;
import n.q;

/* loaded from: classes3.dex */
public final class g extends o {
    public final int A;

    /* renamed from: z, reason: collision with root package name */
    public final Class f32877z;

    public g(Context context, Class cls, int i13) {
        super(context);
        this.f32877z = cls;
        this.A = i13;
    }

    @Override // n.o
    public final q a(int i13, int i14, int i15, CharSequence charSequence) {
        int size = this.f88653f.size() + 1;
        int i16 = this.A;
        if (size > i16) {
            String simpleName = this.f32877z.getSimpleName();
            throw new IllegalArgumentException(a.a.p(a.a.v("Maximum number of items supported by ", simpleName, " is ", i16, ". Limit can be checked with "), simpleName, "#getMaxItemCount()"));
        }
        B();
        q a13 = super.a(i13, i14, i15, charSequence);
        a13.g(true);
        A();
        return a13;
    }

    @Override // n.o, android.view.Menu
    public final SubMenu addSubMenu(int i13, int i14, int i15, CharSequence charSequence) {
        throw new UnsupportedOperationException(this.f32877z.getSimpleName().concat(" does not support submenus"));
    }
}
