package bp;

import androidx.recyclerview.widget.b2;
import com.pinterest.api.model.Feed;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import pk.a0;
import uj2.b0;

/* loaded from: classes3.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public Feed f23616a;

    /* renamed from: b, reason: collision with root package name */
    public final b2 f23617b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f23618c = false;

    /* renamed from: d, reason: collision with root package name */
    public c f23619d;

    public b(Feed feed, b2 b2Var) {
        this.f23616a = feed;
        this.f23617b = b2Var;
    }

    public final synchronized void a() {
        b0 a13;
        if (!this.f23616a.x() && !this.f23618c) {
            if (!a0.s0(this.f23616a.s())) {
                String url = this.f23616a.s();
                m mVar = (m) this;
                int i13 = mVar.f23643e;
                Object obj = mVar.f23644f;
                switch (i13) {
                    case 0:
                        Intrinsics.checkNotNullParameter(url, "url");
                        a13 = ((z12.a) obj).a(url);
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(url, "url");
                        a13 = ((z12.f) obj).a(url);
                        break;
                }
                final int i14 = 0;
                final int i15 = 1;
                nl.b.q(new kk2.g(a13.r(tk2.e.f118017c), new xo.a(this, 3), 2).l(wj2.c.a()), new Function1(this) { // from class: bp.a

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ b f23615b;

                    {
                        this.f23615b = this;
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        int i16 = i14;
                        b bVar = this.f23615b;
                        switch (i16) {
                            case 0:
                                Feed feed = (Feed) obj2;
                                bVar.f23618c = false;
                                c cVar = bVar.f23619d;
                                if (cVar != null) {
                                    cVar.a(bVar.f23616a, true);
                                }
                                int n13 = bVar.f23616a.n();
                                bVar.f23616a.j(feed);
                                bVar.f23617b.n(n13, feed.n());
                                break;
                            default:
                                bVar.f23618c = false;
                                c cVar2 = bVar.f23619d;
                                if (cVar2 != null) {
                                    cVar2.a(bVar.f23616a, false);
                                }
                                break;
                        }
                        return Unit.f80348a;
                    }
                }, new Function1(this) { // from class: bp.a

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ b f23615b;

                    {
                        this.f23615b = this;
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        int i16 = i15;
                        b bVar = this.f23615b;
                        switch (i16) {
                            case 0:
                                Feed feed = (Feed) obj2;
                                bVar.f23618c = false;
                                c cVar = bVar.f23619d;
                                if (cVar != null) {
                                    cVar.a(bVar.f23616a, true);
                                }
                                int n13 = bVar.f23616a.n();
                                bVar.f23616a.j(feed);
                                bVar.f23617b.n(n13, feed.n());
                                break;
                            default:
                                bVar.f23618c = false;
                                c cVar2 = bVar.f23619d;
                                if (cVar2 != null) {
                                    cVar2.a(bVar.f23616a, false);
                                }
                                break;
                        }
                        return Unit.f80348a;
                    }
                });
            }
        }
    }

    public final synchronized void b(Feed feed) {
        this.f23616a = feed;
        g gVar = (g) this.f23617b;
        gVar.getClass();
        gVar.f23630d = feed;
        gVar.h();
        this.f23617b.h();
    }
}
