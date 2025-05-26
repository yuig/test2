package com.pinterest.feature.ideaPinCreation.closeup.view;

import androidx.appcompat.widget.AppCompatImageView;

/* loaded from: classes5.dex */
public abstract class c extends AppCompatImageView implements af2.c {

    /* renamed from: a, reason: collision with root package name */
    public ye2.o f46092a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f46093b;

    @Override // af2.c
    public final af2.b componentManager() {
        if (this.f46092a == null) {
            this.f46092a = new ye2.o(this);
        }
        return this.f46092a;
    }

    @Override // af2.b
    public final Object generatedComponent() {
        if (this.f46092a == null) {
            this.f46092a = new ye2.o(this);
        }
        return this.f46092a.generatedComponent();
    }
}
