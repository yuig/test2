package tz;

import com.pinterest.api.model.AggregatedCommentFeed;
import ke0.b;
import kotlin.jvm.internal.Intrinsics;
import rz.d;
import vd0.c;

/* loaded from: classes3.dex */
public final class a implements d {

    /* renamed from: a, reason: collision with root package name */
    public final b f119709a;

    public a(b aggregatedCommentDeserializer) {
        Intrinsics.checkNotNullParameter(aggregatedCommentDeserializer, "aggregatedCommentDeserializer");
        this.f119709a = aggregatedCommentDeserializer;
    }

    @Override // rz.d
    public final Object b(c pinterestJsonObject) {
        Intrinsics.checkNotNullParameter(pinterestJsonObject, "pinterestJsonObject");
        c m13 = pinterestJsonObject.m("data");
        if (m13 != null) {
            pinterestJsonObject = m13;
        }
        return new AggregatedCommentFeed(pinterestJsonObject, "", this.f119709a);
    }
}
