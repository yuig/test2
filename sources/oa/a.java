package oa;

import androidx.lifecycle.n1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class a implements h {

    /* renamed from: a, reason: collision with root package name */
    public final String f93834a;

    public a(String query) {
        Intrinsics.checkNotNullParameter(query, "query");
        Intrinsics.checkNotNullParameter(query, "query");
        this.f93834a = query;
    }

    @Override // oa.h
    public final void a(g statement) {
        Intrinsics.checkNotNullParameter(statement, "statement");
        n1.d(statement, null);
    }

    @Override // oa.h
    public final String c() {
        return this.f93834a;
    }
}
