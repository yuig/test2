package oh1;

import h32.f1;
import java.util.HashMap;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import nx.d0;

/* loaded from: classes5.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public final a12.d f94568a;

    /* renamed from: b, reason: collision with root package name */
    public final d0 f94569b;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f94570c;

    /* renamed from: d, reason: collision with root package name */
    public final HashMap f94571d;

    public s(a12.d aggregatedCommentService, d0 pinalytics) {
        Intrinsics.checkNotNullParameter(aggregatedCommentService, "aggregatedCommentService");
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        this.f94568a = aggregatedCommentService;
        this.f94569b = pinalytics;
        this.f94570c = new HashMap();
        this.f94571d = new HashMap();
    }

    public final kk2.l a(String commentId, kl2.l callback, Function0 isBound) {
        Intrinsics.checkNotNullParameter(commentId, "commentId");
        Intrinsics.checkNotNullParameter(callback, "callback");
        Intrinsics.checkNotNullParameter(isBound, "isBound");
        xj2.c o13 = this.f94568a.c(commentId).r(tk2.e.f118017c).l(wj2.c.a()).o(new a(3, new aw0.j(isBound, this, commentId, callback, 20)), new a(4, l.f94512l));
        Intrinsics.checkNotNullExpressionValue(o13, "subscribe(...)");
        return (kk2.l) o13;
    }

    public final void b(String commentId, String originalText, kl2.l translationStatusChangeCallback, Function2 fetchTranslationCallback) {
        Intrinsics.checkNotNullParameter(commentId, "commentId");
        Intrinsics.checkNotNullParameter(originalText, "originalText");
        Intrinsics.checkNotNullParameter(translationStatusChangeCallback, "translationStatusChangeCallback");
        Intrinsics.checkNotNullParameter(fetchTranslationCallback, "fetchTranslationCallback");
        HashMap hashMap = this.f94571d;
        Object obj = hashMap.get(commentId);
        rh1.y yVar = rh1.y.PENDING;
        if (obj == yVar) {
            return;
        }
        Object obj2 = hashMap.get(commentId);
        rh1.y yVar2 = rh1.y.TRANSLATED;
        d0 d0Var = this.f94569b;
        if (obj2 == yVar2) {
            d0.v(d0Var, f1.SEE_ORIGINAL_TAP, commentId, false, 12);
            rh1.y yVar3 = rh1.y.ORIGINAL;
            translationStatusChangeCallback.invoke(originalText, commentId, yVar3);
            hashMap.put(commentId, yVar3);
            return;
        }
        if (hashMap.get(commentId) != rh1.y.ORIGINAL) {
            d0.v(d0Var, f1.SEE_TRANSLATION_TAP, commentId, false, 12);
            hashMap.get(commentId);
            translationStatusChangeCallback.invoke(null, commentId, yVar);
            fetchTranslationCallback.invoke(commentId, translationStatusChangeCallback);
            return;
        }
        d0.v(d0Var, f1.SEE_TRANSLATION_TAP, commentId, false, 12);
        String str = (String) this.f94570c.get(commentId);
        if (str != null) {
            translationStatusChangeCallback.invoke(str, commentId, yVar2);
        }
        hashMap.put(commentId, yVar2);
    }
}
