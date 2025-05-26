package i62;

import android.content.ClipData;
import android.content.ClipDescription;
import android.graphics.Bitmap;
import ao2.j0;
import com.bumptech.glide.l;
import dl2.j;
import java.io.File;
import java.io.FileOutputStream;
import kh2.r;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final class a extends j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ ClipDescription f71627r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ ClipData f71628s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ b f71629t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(ClipDescription clipDescription, ClipData clipData, b bVar, bl2.c cVar) {
        super(2, cVar);
        this.f71627r = clipDescription;
        this.f71628s = clipData;
        this.f71629t = bVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new a(this.f71627r, this.f71628s, this.f71629t, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((a) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        if (this.f71627r.filterMimeTypes("image/*") == null) {
            return null;
        }
        try {
            l J2 = com.bumptech.glide.b.f(this.f71629t.f71630a).c().J(this.f71628s.getItemAt(0).getUri());
            int i13 = t62.a.f116456a;
            Bitmap bitmap = (Bitmap) ((l) ((l) J2.m(i13, i13)).b()).L(Integer.MIN_VALUE, Integer.MIN_VALUE).get();
            File createTempFile = File.createTempFile("clipboard_", ".png");
            createTempFile.mkdirs();
            FileOutputStream fileOutputStream = new FileOutputStream(createTempFile);
            try {
                bitmap.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream);
                Unit unit = Unit.f80348a;
                dl2.b.J(fileOutputStream, null);
                return r.f(createTempFile, bitmap.getWidth(), bitmap.getHeight());
            } finally {
            }
        } catch (Exception unused) {
            return null;
        }
    }
}
