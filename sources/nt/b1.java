package nt;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class b1 extends h1 {

    /* renamed from: c, reason: collision with root package name */
    public final e1 f91988c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1(e1 countryQuestion) {
        super(countryQuestion.f92018a, countryQuestion.f92019b);
        Intrinsics.checkNotNullParameter(countryQuestion, "countryQuestion");
        this.f91988c = countryQuestion;
    }

    @Override // nt.h1
    public final String a() {
        String str;
        m91.b bVar = (m91.b) this.f91988c.f92026i;
        return (bVar == null || (str = bVar.f86723c) == null) ? "" : str;
    }

    @Override // nt.h1
    public final void b(String newData) {
        Intrinsics.checkNotNullParameter(newData, "newData");
        this.f91988c.a(newData);
    }
}
