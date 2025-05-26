package wc2;

import android.content.res.AssetManager;
import ao2.j0;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

/* loaded from: classes4.dex */
public final class k extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ AssetManager f129139r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ u50.r f129140s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(AssetManager assetManager, u50.r rVar, bl2.c cVar) {
        super(2, cVar);
        this.f129139r = assetManager;
        this.f129140s = rVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new k(this.f129139r, this.f129140s, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((k) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        try {
            InputStream open = this.f129139r.open("adChoicesRemoval.js");
            Intrinsics.checkNotNullExpressionValue(open, "open(...)");
            Reader inputStreamReader = new InputStreamReader(open, Charsets.UTF_8);
            BufferedReader bufferedReader = inputStreamReader instanceof BufferedReader ? (BufferedReader) inputStreamReader : new BufferedReader(inputStreamReader, 8192);
            try {
                String z23 = kh2.j.z2(bufferedReader);
                dl2.b.J(bufferedReader, null);
                this.f129140s.a(new h(z23));
            } finally {
            }
        } catch (Exception e13) {
            e13.printStackTrace();
        }
        return Unit.f80348a;
    }
}
