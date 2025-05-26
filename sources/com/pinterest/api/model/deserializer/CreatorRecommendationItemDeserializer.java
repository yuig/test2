package com.pinterest.api.model.deserializer;

import com.pinterest.api.model.jg;
import com.pinterest.api.model.wy0;
import com.pinterest.api.model.zs;
import dl1.s;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ke0.a;
import ke0.b;
import kotlin.Metadata;
import kotlin.collections.g0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import vd0.c;
import x02.v1;
import x02.x2;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003B\u0019\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/pinterest/api/model/deserializer/CreatorRecommendationItemDeserializer;", "Lke0/a;", "Lcom/pinterest/api/model/jg;", "Lke0/b;", "Lx02/v1;", "interestRepository", "Lx02/x2;", "userRepository", "<init>", "(Lx02/v1;Lx02/x2;)V", "repository_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class CreatorRecommendationItemDeserializer extends a implements b {

    /* renamed from: b, reason: collision with root package name */
    public final v1 f36762b;

    /* renamed from: c, reason: collision with root package name */
    public final x2 f36763c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreatorRecommendationItemDeserializer(@NotNull v1 interestRepository, @NotNull x2 userRepository) {
        super("creatorrecommendationitem");
        Intrinsics.checkNotNullParameter(interestRepository, "interestRepository");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        this.f36762b = interestRepository;
        this.f36763c = userRepository;
    }

    @Override // ke0.b
    public final List a(vd0.a arr, boolean z13) {
        Intrinsics.checkNotNullParameter(arr, "arr");
        ArrayList arrayList = new ArrayList(g0.q(arr, 10));
        Iterator it = arr.iterator();
        while (it.hasNext()) {
            c cVar = (c) it.next();
            Intrinsics.f(cVar);
            arrayList.add(e(cVar, z13));
        }
        return arrayList;
    }

    @Override // ke0.b
    public final List c(vd0.a arr) {
        Intrinsics.checkNotNullParameter(arr, "arr");
        return a(arr, true);
    }

    @Override // ke0.a
    public final s d(c json) {
        Intrinsics.checkNotNullParameter(json, "json");
        return e(json, true);
    }

    public final jg e(c cVar, boolean z13) {
        Object e13 = c.f125622b.e(cVar.f125623a, jg.class);
        Intrinsics.g(e13, "null cannot be cast to non-null type com.pinterest.api.model.CreatorRecommendationItem");
        jg jgVar = (jg) e13;
        if (z13) {
            wy0 q13 = jgVar.q();
            if (q13 != null) {
                this.f36763c.Z(q13);
            }
            zs n13 = jgVar.n();
            if (n13 != null) {
                this.f36762b.Z(n13);
            }
        }
        return jgVar;
    }
}
