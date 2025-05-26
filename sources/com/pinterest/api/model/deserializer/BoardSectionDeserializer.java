package com.pinterest.api.model.deserializer;

import com.pinterest.api.model.ba;
import d12.i;
import dl1.s;
import java.util.ArrayList;
import java.util.List;
import ke0.a;
import ke0.b;
import kotlin.Metadata;
import kotlin.collections.e0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import vd0.c;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003B\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/pinterest/api/model/deserializer/BoardSectionDeserializer;", "Lke0/a;", "Lcom/pinterest/api/model/ba;", "Lke0/b;", "Ld12/i;", "repositoryBatcher", "<init>", "(Ld12/i;)V", "repository_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class BoardSectionDeserializer extends a implements b {

    /* renamed from: b, reason: collision with root package name */
    public final i f36750b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BoardSectionDeserializer(@NotNull i repositoryBatcher) {
        super("board_section");
        Intrinsics.checkNotNullParameter(repositoryBatcher, "repositoryBatcher");
        this.f36750b = repositoryBatcher;
    }

    @Override // ke0.b
    public final List a(vd0.a arr, boolean z13) {
        Intrinsics.checkNotNullParameter(arr, "arr");
        return c(arr);
    }

    @Override // ke0.b
    public final List c(vd0.a arr) {
        Intrinsics.checkNotNullParameter(arr, "arr");
        ArrayList arrayList = new ArrayList(arr.d());
        int d2 = arr.d();
        for (int i13 = 0; i13 < d2; i13++) {
            c json = arr.b(i13);
            Intrinsics.checkNotNullExpressionValue(json, "getJsonObject(...)");
            Intrinsics.checkNotNullParameter(json, "json");
            Object e13 = c.f125622b.e(json.f125623a, ba.class);
            Intrinsics.g(e13, "null cannot be cast to non-null type com.pinterest.api.model.BoardSection");
            ba baVar = (ba) e13;
            new j10.b(e0.b(baVar), this).b();
            arrayList.add(baVar);
        }
        new j10.b(arrayList, this).b();
        return arrayList;
    }

    @Override // ke0.a
    public final s d(c json) {
        Intrinsics.checkNotNullParameter(json, "json");
        Object e13 = c.f125622b.e(json.f125623a, ba.class);
        Intrinsics.g(e13, "null cannot be cast to non-null type com.pinterest.api.model.BoardSection");
        ba baVar = (ba) e13;
        new j10.b(e0.b(baVar), this).b();
        return baVar;
    }
}
