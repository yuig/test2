package jg1;

import et1.j0;
import java.util.LinkedList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class a0 {

    /* renamed from: a, reason: collision with root package name */
    public final et1.z f75904a;

    /* renamed from: b, reason: collision with root package name */
    public final et1.g f75905b;

    /* renamed from: c, reason: collision with root package name */
    public final et1.r f75906c;

    /* renamed from: d, reason: collision with root package name */
    public final et1.m f75907d;

    /* renamed from: e, reason: collision with root package name */
    public final gi2.b f75908e;

    /* renamed from: f, reason: collision with root package name */
    public final t.a f75909f;

    /* renamed from: g, reason: collision with root package name */
    public final LinkedList f75910g;

    /* renamed from: h, reason: collision with root package name */
    public j0 f75911h;

    public a0(et1.z concatenatingProducerFactory, et1.p composerPipelineAdapterProvider, et1.r demuxerFactory, et1.m muxRenderNodeFactory, gi2.b timeRangeTrimmerFactory, t.a mediaPacketStartTimeSetterFactory) {
        Intrinsics.checkNotNullParameter(concatenatingProducerFactory, "concatenatingProducerFactory");
        Intrinsics.checkNotNullParameter(composerPipelineAdapterProvider, "composerPipelineAdapterProvider");
        Intrinsics.checkNotNullParameter(demuxerFactory, "demuxerFactory");
        Intrinsics.checkNotNullParameter(muxRenderNodeFactory, "muxRenderNodeFactory");
        Intrinsics.checkNotNullParameter(timeRangeTrimmerFactory, "timeRangeTrimmerFactory");
        Intrinsics.checkNotNullParameter(mediaPacketStartTimeSetterFactory, "mediaPacketStartTimeSetterFactory");
        this.f75904a = concatenatingProducerFactory;
        this.f75905b = composerPipelineAdapterProvider;
        this.f75906c = demuxerFactory;
        this.f75907d = muxRenderNodeFactory;
        this.f75908e = timeRangeTrimmerFactory;
        this.f75909f = mediaPacketStartTimeSetterFactory;
        this.f75910g = new LinkedList();
    }
}
