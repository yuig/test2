package nt;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class c1 extends h1 {

    /* renamed from: c, reason: collision with root package name */
    public final e1 f91996c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1(e1 monthQuestion) {
        super(monthQuestion.f92018a, monthQuestion.f92019b);
        Intrinsics.checkNotNullParameter(monthQuestion, "monthQuestion");
        this.f91996c = monthQuestion;
    }

    @Override // nt.h1
    public final String a() {
        ju.h hVar;
        String name;
        ju.i iVar = (ju.i) this.f91996c.f92026i;
        return (iVar == null || (hVar = iVar.f77608a) == null || (name = hVar.name()) == null) ? "" : name;
    }

    @Override // nt.h1
    public final void b(String newData) {
        Intrinsics.checkNotNullParameter(newData, "newData");
        this.f91996c.a(newData);
    }
}
