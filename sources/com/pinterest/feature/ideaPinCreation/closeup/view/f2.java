package com.pinterest.feature.ideaPinCreation.closeup.view;

import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final class f2 extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f46186i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ IdeaPinTextEditor f46187j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f2(IdeaPinTextEditor ideaPinTextEditor, int i13) {
        super(0);
        this.f46186i = i13;
        this.f46187j = ideaPinTextEditor;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i13 = this.f46186i;
        IdeaPinTextEditor ideaPinTextEditor = this.f46187j;
        switch (i13) {
            case 0:
                return new cu.k(ideaPinTextEditor, 2);
            default:
                return new h2(ideaPinTextEditor);
        }
    }
}
