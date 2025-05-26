package com.pinterest.experience.models.framework;

import hh0.f;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.z0;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/pinterest/experience/models/framework/ExperienceDataDeserializationException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "g4/u", "models_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class ExperienceDataDeserializationException extends RuntimeException {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f45050c = 0;

    /* renamed from: a, reason: collision with root package name */
    public final String f45051a;

    /* renamed from: b, reason: collision with root package name */
    public final Map f45052b;

    public /* synthetic */ ExperienceDataDeserializationException(f fVar, String str, Map map, int i13) {
        this(fVar, str, (i13 & 4) != 0 ? z0.d() : map, (Throwable) null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public ExperienceDataDeserializationException(hh0.f r4, java.lang.String r5, java.util.Map r6, java.lang.Throwable r7) {
        /*
            r3 = this;
            if (r4 == 0) goto L28
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r4.f69145b
            r0.append(r1)
            java.lang.String r1 = ":"
            r0.append(r1)
            java.lang.String r2 = r4.f69144a
            r0.append(r2)
            r0.append(r1)
            i32.a0 r4 = r4.f69148e
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            goto L29
        L28:
            r4 = 0
        L29:
            java.lang.String r0 = "Failed to deserialize experience: "
            java.lang.String r1 = " "
            java.lang.StringBuilder r4 = a.a.w(r0, r4, r1, r5, r1)
            r4.append(r6)
            java.lang.String r4 = r4.toString()
            r3.<init>(r4, r7)
            r3.f45051a = r5
            r3.f45052b = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pinterest.experience.models.framework.ExperienceDataDeserializationException.<init>(hh0.f, java.lang.String, java.util.Map, java.lang.Throwable):void");
    }
}
