package com.pinterest.mediaPipeline;

import et1.d;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.q0;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"Lcom/pinterest/mediaPipeline/PipelineException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "mediaPipeline_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class PipelineException extends RuntimeException {

    /* renamed from: a, reason: collision with root package name */
    public final List f49887a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f49888b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PipelineException(String message, List extraNodeInfo, Throwable th3, Object obj, d pipeline) {
        super(message, th3);
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(extraNodeInfo, "extraNodeInfo");
        Intrinsics.checkNotNullParameter(pipeline, "pipeline");
        this.f49887a = extraNodeInfo;
        this.f49888b = obj;
    }

    public PipelineException(String str, List list, Throwable th3, Object obj, d dVar, int i13) {
        this(str, (i13 & 2) != 0 ? q0.f80391a : list, (i13 & 4) != 0 ? null : th3, (i13 & 8) != 0 ? null : obj, dVar);
    }
}
