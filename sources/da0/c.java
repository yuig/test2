package da0;

import android.content.Context;
import android.graphics.Bitmap;
import ao2.j0;
import ca0.g1;
import ca0.i;
import ca0.i1;
import ca0.m;
import dl2.j;
import h62.k;
import java.io.File;
import java.io.FileOutputStream;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.z;
import m1.v0;
import n72.l;
import r72.f2;
import r72.m1;
import r72.x0;
import r72.y0;
import u50.r;
import ve.h;
import xk2.q;
import xk2.s;

/* loaded from: classes5.dex */
public final class c extends j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public r f54205r;

    /* renamed from: s, reason: collision with root package name */
    public int f54206s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ f f54207t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ r f54208u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(f fVar, r rVar, bl2.c cVar) {
        super(2, cVar);
        this.f54207t = fVar;
        this.f54208u = rVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new c(this.f54207t, this.f54208u, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((c) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        Object m13;
        r rVar;
        x0 x0Var;
        y0 b13;
        Object obj2;
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f54206s;
        if (i13 == 0) {
            ue.c.H(obj);
            f fVar = this.f54207t;
            f2 f2Var = (f2) fVar.f54214b.f67841c.f55726a.getValue();
            String str = f2Var.f106469a;
            i iVar = new i(str, f2Var.f106470b, f2Var.f106476h);
            r rVar2 = this.f54208u;
            rVar2.a(iVar);
            k kVar = fVar.f54214b;
            m1 m1Var = kVar.f67847i;
            String str2 = (m1Var == null || (x0Var = m1Var.f106553c) == null || (b13 = x0Var.b()) == null) ? null : b13.f106716a;
            kVar.f67839a.b("ComposerProject: thumbnail accessed", l.VERBOSE);
            Bitmap bitmap = kVar.f67846h;
            if (str2 != null && !z.j(str2)) {
                rVar2.a(new m(new i1(str2)));
            } else if (bitmap != null) {
                this.f54205r = rVar2;
                this.f54206s = 1;
                h72.m mVar = (h72.m) fVar.f54218f;
                mVar.getClass();
                String name = "shuffleThumbnail-" + System.currentTimeMillis() + ".jpg";
                Context context = mVar.f67997a;
                Intrinsics.checkNotNullParameter(context, "context");
                Intrinsics.checkNotNullParameter(name, "name");
                Intrinsics.checkNotNullParameter("shuffle_thumbs", "dirName");
                File file = new File(context.getFilesDir(), "shuffle_thumbs");
                if (!file.exists()) {
                    file.mkdirs();
                }
                File file2 = new File(file, name);
                Bitmap.CompressFormat compressFormat = Bitmap.CompressFormat.JPEG;
                Intrinsics.checkNotNullParameter(bitmap, "bitmap");
                Intrinsics.checkNotNullParameter(file2, "file");
                Intrinsics.checkNotNullParameter(compressFormat, "compressFormat");
                try {
                    q qVar = s.f135225b;
                    FileOutputStream fileOutputStream = new FileOutputStream(file2);
                    try {
                        boolean compress = bitmap.compress(compressFormat, 90, fileOutputStream);
                        dl2.b.J(fileOutputStream, null);
                        m13 = Boolean.valueOf(compress);
                    } finally {
                    }
                } catch (Throwable th3) {
                    q qVar2 = s.f135225b;
                    m13 = ue.c.m(th3);
                }
                if (s.a(m13) != null) {
                    m13 = Boolean.FALSE;
                }
                if (file2 == aVar) {
                    return aVar;
                }
                rVar = rVar2;
                obj2 = file2;
                rVar.a(new m(new g1((File) obj2)));
            } else {
                this.f54206s = 2;
                Object collect = new do2.j0(h.x(fVar.f54216d, str), new v0(4, null)).collect(new b(rVar2, 0), this);
                if (collect != aVar) {
                    collect = Unit.f80348a;
                }
                if (collect == aVar) {
                    return aVar;
                }
            }
        } else if (i13 == 1) {
            rVar = this.f54205r;
            ue.c.H(obj);
            obj2 = obj;
            rVar.a(new m(new g1((File) obj2)));
        } else {
            if (i13 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ue.c.H(obj);
        }
        return Unit.f80348a;
    }
}
