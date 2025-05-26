package jg1;

import android.media.MediaFormat;
import android.opengl.EGLContext;
import android.util.Size;
import et1.m0;
import java.util.LinkedList;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class n extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ q f76017i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ d0 f76018j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ MediaFormat f76019k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Size f76020l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ String f76021m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ String f76022n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ List f76023o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ m0 f76024p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f76025q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ List f76026r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ EGLContext f76027s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(q qVar, d0 d0Var, MediaFormat mediaFormat, Size size, String str, String str2, List list, m0 m0Var, int i13, LinkedList linkedList, EGLContext eGLContext) {
        super(0);
        this.f76017i = qVar;
        this.f76018j = d0Var;
        this.f76019k = mediaFormat;
        this.f76020l = size;
        this.f76021m = str;
        this.f76022n = str2;
        this.f76023o = list;
        this.f76024p = m0Var;
        this.f76025q = i13;
        this.f76026r = linkedList;
        this.f76027s = eGLContext;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        vt1.b bVar = (vt1.b) this.f76017i.f76056p.getValue();
        d0 d0Var = this.f76018j;
        et1.j mediaExtractor = d0Var.f75958b;
        boolean z13 = this.f76025q == this.f76026r.size() - 1;
        bVar.getClass();
        Intrinsics.checkNotNullParameter(mediaExtractor, "mediaExtractor");
        MediaFormat outputFormat = this.f76019k;
        Intrinsics.checkNotNullParameter(outputFormat, "outputFormat");
        Size outputResolution = this.f76020l;
        Intrinsics.checkNotNullParameter(outputResolution, "outputResolution");
        String encoderName = this.f76021m;
        Intrinsics.checkNotNullParameter(encoderName, "encoderName");
        List bitmapConfigs = this.f76023o;
        Intrinsics.checkNotNullParameter(bitmapConfigs, "bitmapConfigs");
        Size inputResolution = d0Var.f75961e;
        Intrinsics.checkNotNullParameter(inputResolution, "inputResolution");
        m0 muxRender = this.f76024p;
        Intrinsics.checkNotNullParameter(muxRender, "muxRender");
        float[] exportMatrix = d0Var.f75966j;
        Intrinsics.checkNotNullParameter(exportMatrix, "exportMatrix");
        return new c0(bVar.f126638a, mediaExtractor, d0Var.f75962f, outputFormat, outputResolution, encoderName, this.f76022n, bitmapConfigs, inputResolution, muxRender, d0Var.f75959c, d0Var.f75960d, d0Var.f75963g, exportMatrix, z13, d0Var.f75965i, bVar.f126639b, this.f76027s, d0Var.f75964h);
    }
}
