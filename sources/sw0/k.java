package sw0;

import android.net.Uri;
import android.os.Build;
import android.provider.MediaStore;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final class k extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: j, reason: collision with root package name */
    public static final k f115497j = new k(0);

    /* renamed from: k, reason: collision with root package name */
    public static final k f115498k = new k(1);

    /* renamed from: l, reason: collision with root package name */
    public static final k f115499l = new k(2);

    /* renamed from: m, reason: collision with root package name */
    public static final k f115500m = new k(3);

    /* renamed from: n, reason: collision with root package name */
    public static final k f115501n = new k(4);

    /* renamed from: o, reason: collision with root package name */
    public static final k f115502o = new k(5);

    /* renamed from: p, reason: collision with root package name */
    public static final k f115503p = new k(6);

    /* renamed from: q, reason: collision with root package name */
    public static final k f115504q = new k(7);

    /* renamed from: r, reason: collision with root package name */
    public static final k f115505r = new k(8);

    /* renamed from: s, reason: collision with root package name */
    public static final k f115506s = new k(9);

    /* renamed from: t, reason: collision with root package name */
    public static final k f115507t = new k(10);

    /* renamed from: u, reason: collision with root package name */
    public static final k f115508u = new k(11);

    /* renamed from: v, reason: collision with root package name */
    public static final k f115509v = new k(12);

    /* renamed from: w, reason: collision with root package name */
    public static final k f115510w = new k(13);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f115511i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(int i13) {
        super(0);
        this.f115511i = i13;
    }

    public final Uri b() {
        switch (this.f115511i) {
            case 3:
                return Build.VERSION.SDK_INT >= 29 ? MediaStore.Images.Media.getContentUri("external") : MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
            default:
                return Build.VERSION.SDK_INT >= 29 ? MediaStore.Video.Media.getContentUri("external") : MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f115511i) {
            case 0:
                return Unit.f80348a;
            case 1:
                return Unit.f80348a;
            case 2:
                return new y();
            case 3:
                return b();
            case 4:
                return b();
            case 5:
                return new HashMap();
            case 6:
                return new AtomicBoolean(true);
            case 7:
                return new ReentrantReadWriteLock();
            case 8:
                return new AtomicInteger(0);
            case 9:
                return new w();
            case 10:
                return new uk2.f();
            case 11:
                return Unit.f80348a;
            case 12:
                return Unit.f80348a;
            default:
                pw0.c cVar = new pw0.c();
                cVar.f101498d = kotlin.collections.q0.f80391a;
                return cVar;
        }
    }
}
