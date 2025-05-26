package androidx.work;

import android.content.Context;
import ao2.m0;
import bl2.c;
import kb.a0;
import kb.h;
import kb.i;
import kb.j;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import r4.l;
import tb.f;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u00002\u00020\u0001:\u0001\bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Landroidx/work/CoroutineWorker;", "Lkb/a0;", "Landroid/content/Context;", "appContext", "Landroidx/work/WorkerParameters;", "params", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "kb/h", "work-runtime_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes3.dex */
public abstract class CoroutineWorker extends a0 {

    /* renamed from: e, reason: collision with root package name */
    public final WorkerParameters f19993e;

    /* renamed from: f, reason: collision with root package name */
    public final h f19994f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoroutineWorker(@NotNull Context appContext, @NotNull WorkerParameters params) {
        super(appContext, params);
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        Intrinsics.checkNotNullParameter(params, "params");
        this.f19993e = params;
        this.f19994f = h.f78999c;
    }

    @Override // kb.a0
    public final l d() {
        return f.S(this.f19994f.plus(m0.b()), new i(this, null));
    }

    @Override // kb.a0
    public final void f() {
    }

    @Override // kb.a0
    public final l g() {
        h hVar = h.f78999c;
        CoroutineContext coroutineContext = this.f19994f;
        if (Intrinsics.d(coroutineContext, hVar)) {
            coroutineContext = this.f19993e.f20002f;
        }
        Intrinsics.checkNotNullExpressionValue(coroutineContext, "if (coroutineContext != …rkerContext\n            }");
        return f.S(coroutineContext.plus(m0.b()), new j(this, null));
    }

    public abstract Object i(c cVar);
}
