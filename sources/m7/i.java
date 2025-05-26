package m7;

import java.util.Locale;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public int f86193a;

    /* renamed from: b, reason: collision with root package name */
    public int f86194b;

    /* renamed from: c, reason: collision with root package name */
    public int f86195c;

    /* renamed from: d, reason: collision with root package name */
    public int f86196d;

    /* renamed from: e, reason: collision with root package name */
    public int f86197e;

    /* renamed from: f, reason: collision with root package name */
    public int f86198f;

    /* renamed from: g, reason: collision with root package name */
    public int f86199g;

    /* renamed from: h, reason: collision with root package name */
    public int f86200h;

    /* renamed from: i, reason: collision with root package name */
    public int f86201i;

    /* renamed from: j, reason: collision with root package name */
    public int f86202j;

    /* renamed from: k, reason: collision with root package name */
    public long f86203k;

    /* renamed from: l, reason: collision with root package name */
    public int f86204l;

    public final String toString() {
        int i13 = this.f86193a;
        int i14 = this.f86194b;
        int i15 = this.f86195c;
        int i16 = this.f86196d;
        int i17 = this.f86197e;
        int i18 = this.f86198f;
        int i19 = this.f86199g;
        int i23 = this.f86200h;
        int i24 = this.f86201i;
        int i25 = this.f86202j;
        long j13 = this.f86203k;
        int i26 = this.f86204l;
        int i27 = d7.n0.f53866a;
        Locale locale = Locale.US;
        StringBuilder t13 = a.a.t("DecoderCounters {\n decoderInits=", i13, ",\n decoderReleases=", i14, "\n queuedInputBuffers=");
        a.a.z(t13, i15, "\n skippedInputBuffers=", i16, "\n renderedOutputBuffers=");
        a.a.z(t13, i17, "\n skippedOutputBuffers=", i18, "\n droppedBuffers=");
        a.a.z(t13, i19, "\n droppedInputBuffers=", i23, "\n maxConsecutiveDroppedBuffers=");
        a.a.z(t13, i24, "\n droppedToKeyframeEvents=", i25, "\n totalVideoFrameProcessingOffsetUs=");
        t13.append(j13);
        t13.append("\n videoFrameProcessingOffsetCount=");
        t13.append(i26);
        t13.append("\n}");
        return t13.toString();
    }
}
