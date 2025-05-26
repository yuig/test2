package ve;

import java.io.File;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final String f125662a;

    /* renamed from: b, reason: collision with root package name */
    public final String f125663b;

    /* renamed from: c, reason: collision with root package name */
    public final String f125664c;

    /* renamed from: d, reason: collision with root package name */
    public final int f125665d;

    /* renamed from: e, reason: collision with root package name */
    public final float[] f125666e;

    /* renamed from: f, reason: collision with root package name */
    public File f125667f;

    /* renamed from: g, reason: collision with root package name */
    public b f125668g;

    /* renamed from: h, reason: collision with root package name */
    public Runnable f125669h;

    public e(String useCase, String assetUri, String str, int i13, float[] fArr) {
        Intrinsics.checkNotNullParameter(useCase, "useCase");
        Intrinsics.checkNotNullParameter(assetUri, "assetUri");
        this.f125662a = useCase;
        this.f125663b = assetUri;
        this.f125664c = str;
        this.f125665d = i13;
        this.f125666e = fArr;
    }
}
