package x52;

import android.os.Environment;
import ao2.j0;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class j extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ n f133870r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ String f133871s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(n nVar, String str, bl2.c cVar) {
        super(2, cVar);
        this.f133870r = nVar;
        this.f133871s = str;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new j(this.f133870r, this.f133871s, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((j) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        File externalStoragePublicDirectory = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS);
        Intrinsics.checkNotNullExpressionValue(externalStoragePublicDirectory, "getExternalStoragePublicDirectory(...)");
        File file = new File(a.a.C(externalStoragePublicDirectory.getPath(), "/watermark.mp4"));
        InputStream open = this.f133870r.f133891a.getAssets().open(this.f133871s);
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            Intrinsics.f(open);
            fileOutputStream.write(bs1.c.I1(open));
            Unit unit = Unit.f80348a;
            dl2.b.J(open, null);
            return file;
        } finally {
        }
    }
}
