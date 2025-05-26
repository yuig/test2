package com.pinterest.typeaheadroom;

import android.content.Context;
import ja.e0;
import ja.g;
import ja.s;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import lb.h0;
import oa.d;
import oa.f;
import x92.b;

/* loaded from: classes2.dex */
public final class AppDatabase_Impl extends AppDatabase {

    /* renamed from: m, reason: collision with root package name */
    public volatile b f52201m;

    @Override // ja.d0
    public final s d() {
        return new s(this, new HashMap(0), new HashMap(0), "SearchTypeaheadSuggestionRoom");
    }

    @Override // ja.d0
    public final f e(g gVar) {
        e0 callback = new e0(gVar, new h0(this, 2, 2), "67a542dce72d8ccb2fedef1b9ef7bd2f", "ae22a30d04ab04b99c0794c6988d3a19");
        Context context = gVar.f75216a;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(callback, "callback");
        return gVar.f75218c.q(new d(context, gVar.f75217b, callback, false, false));
    }

    @Override // ja.d0
    public final List f(LinkedHashMap linkedHashMap) {
        return new ArrayList();
    }

    @Override // ja.d0
    public final Set i() {
        return new HashSet();
    }

    @Override // ja.d0
    public final Map j() {
        HashMap hashMap = new HashMap();
        hashMap.put(b.class, Collections.emptyList());
        return hashMap;
    }

    @Override // com.pinterest.typeaheadroom.AppDatabase
    public final b t() {
        b bVar;
        if (this.f52201m != null) {
            return this.f52201m;
        }
        synchronized (this) {
            try {
                if (this.f52201m == null) {
                    this.f52201m = new b(this);
                }
                bVar = this.f52201m;
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return bVar;
    }
}
