package c10;

import com.apollographql.apollo3.exception.ApolloCompositeException;
import com.apollographql.apollo3.exception.ApolloException;
import com.apollographql.apollo3.exception.ApolloHttpException;
import com.apollographql.apollo3.exception.ApolloNetworkException;
import com.apollographql.apollo3.exception.ApolloParseException;
import com.apollographql.apollo3.exception.ApolloWebSocketClosedException;
import com.apollographql.apollo3.exception.AutoPersistedQueriesNotSupported;
import com.apollographql.apollo3.exception.CacheMissException;
import com.apollographql.apollo3.exception.HttpCacheMissException;
import com.apollographql.apollo3.exception.JsonDataException;
import com.apollographql.apollo3.exception.JsonEncodingException;
import com.apollographql.apollo3.exception.MissingValueException;
import com.google.android.gms.common.api.internal.b0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import m60.f0;
import m60.w;
import okhttp3.internal.Util;
import qb0.e;
import t00.h;
import t00.i;
import t00.k;
import wo2.l;

/* loaded from: classes.dex */
public final class d extends t00.b {

    /* renamed from: b, reason: collision with root package name */
    public final w f24485b;

    /* renamed from: c, reason: collision with root package name */
    public final b0 f24486c;

    /* renamed from: d, reason: collision with root package name */
    public final b f24487d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(w eventManager, f0 devUtils, b0 errorDialogHandler, b graphQLCommonErrorHandler, b60.b activeUserManager) {
        super(activeUserManager);
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        Intrinsics.checkNotNullParameter(devUtils, "devUtils");
        Intrinsics.checkNotNullParameter(errorDialogHandler, "errorDialogHandler");
        Intrinsics.checkNotNullParameter(graphQLCommonErrorHandler, "graphQLCommonErrorHandler");
        Intrinsics.checkNotNullParameter(activeUserManager, "activeUserManager");
        this.f24485b = eventManager;
        this.f24486c = errorDialogHandler;
        this.f24487d = graphQLCommonErrorHandler;
    }

    @Override // t00.m
    public final void a(qz.d response, String baseUrl, Throwable th3) {
        l lVar;
        Intrinsics.checkNotNullParameter(response, "response");
        Intrinsics.checkNotNullParameter(baseUrl, "baseUrl");
        if (!(th3 instanceof ApolloException)) {
            if (th3 != null) {
                throw th3;
            }
            throw new IllegalStateException("GraphQL response had a null network exception");
        }
        ApolloException apolloException = (ApolloException) th3;
        if (apolloException instanceof ApolloNetworkException) {
            d((ApolloNetworkException) apolloException, response, baseUrl, new c(this, 1));
            return;
        }
        if (apolloException instanceof JsonEncodingException) {
            c(apolloException, response, baseUrl);
            return;
        }
        if (apolloException instanceof JsonDataException) {
            c(apolloException, response, baseUrl);
            return;
        }
        if (apolloException instanceof ApolloParseException) {
            c(apolloException, response, baseUrl);
            return;
        }
        if (apolloException instanceof HttpCacheMissException) {
            c(apolloException, response, baseUrl);
            return;
        }
        if (apolloException instanceof ApolloWebSocketClosedException) {
            d((ApolloWebSocketClosedException) apolloException, response, baseUrl, new c(this, 2));
            return;
        }
        if (apolloException instanceof MissingValueException) {
            c(apolloException, response, baseUrl);
            return;
        }
        if (apolloException instanceof ApolloCompositeException) {
            c(apolloException, response, baseUrl);
            return;
        }
        if (apolloException instanceof CacheMissException) {
            return;
        }
        if (!(apolloException instanceof ApolloHttpException)) {
            if (apolloException instanceof AutoPersistedQueriesNotSupported) {
                c(apolloException, response, baseUrl);
                return;
            } else {
                c(apolloException, response, baseUrl);
                return;
            }
        }
        ApolloHttpException apolloHttpException = (ApolloHttpException) apolloException;
        if (response.f105387g != -1000 || (lVar = apolloHttpException.f29067c) == null) {
            d(apolloHttpException, response, baseUrl, new c(this, 0));
            return;
        }
        try {
            vd0.c cVar = new vd0.c(lVar.C1(Util.t(lVar, Charsets.UTF_8)));
            dl2.b.J(lVar, null);
            e(apolloHttpException, new qz.d(cVar), baseUrl);
        } catch (Throwable th4) {
            try {
                throw th4;
            } catch (Throwable th5) {
                dl2.b.J(lVar, th4);
                throw th5;
            }
        }
    }

    public final void c(ApolloException apolloException, qz.d dVar, String str) {
        d(apolloException, dVar, str, new c(this, 3));
    }

    public final void d(ApolloException apolloException, qz.d dVar, String str, c cVar) {
        if (dVar.f105387g == -1000) {
            cVar.invoke(apolloException, dVar, str);
        } else {
            e(apolloException, dVar, str);
        }
    }

    public final void e(ApolloException apolloException, qz.d response, String str) {
        int i13 = response.f105387g;
        Integer valueOf = apolloException instanceof ApolloWebSocketClosedException ? Integer.valueOf(((ApolloWebSocketClosedException) apolloException).getF29069a()) : apolloException instanceof ApolloHttpException ? Integer.valueOf(((ApolloHttpException) apolloException).getF29065a()) : null;
        if (((b60.d) this.f115663a).i() && h.a().contains(Integer.valueOf(i13))) {
            this.f24485b.d(new t00.a(str));
        }
        int intValue = valueOf != null ? valueOf.intValue() : -1000;
        b0 b0Var = this.f24486c;
        b0Var.getClass();
        Intrinsics.checkNotNullParameter(response, "response");
        ((k) b0Var.f30792e).a(i13, response, Integer.valueOf(intValue));
        if (((e) b0Var.f30790c).c()) {
            ((a) b0Var.f30791d).getClass();
            boolean contains = h.f115688b.contains(Integer.valueOf(i13));
            Object obj = b0Var.f30793f;
            if (contains) {
                ((i) obj).a(response.f105384d, response.f105385e);
                return;
            }
            if (b0Var.f30788a) {
                ((a) b0Var.f30791d).getClass();
                if (!h.f115689c.contains(Integer.valueOf(i13)) && i13 != -1000) {
                    ((i) obj).b(response.f105384d, apolloException);
                    return;
                }
            }
            if (b0Var.f30788a) {
                ((m60.d) ((m60.e) b0Var.f30789b)).g();
            }
        }
    }
}
