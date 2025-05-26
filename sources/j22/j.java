package j22;

import com.pinterest.feature.search.typeahead.model.SearchTypeaheadItemFeed;
import dl1.a0;
import dl1.m;
import dl1.s;
import java.util.ArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import uj2.b0;
import x02.k2;

/* loaded from: classes4.dex */
public final class j implements a0 {

    /* renamed from: a, reason: collision with root package name */
    public final b f74540a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f74541b;

    public j(b searchService, boolean z13) {
        Intrinsics.checkNotNullParameter(searchService, "searchService");
        this.f74540a = searchService;
        this.f74541b = z13;
    }

    @Override // dl1.a0
    public final uj2.b a(m mVar) {
        k2 params = (k2) mVar;
        Intrinsics.checkNotNullParameter(params, "params");
        String str = params.f131436h == l.YOURS ? "PERSONAL" : "PIN";
        String str2 = params.f131433e;
        Intrinsics.checkNotNullExpressionValue(str2, "getQuery(...)");
        return this.f74540a.h(str, str2);
    }

    @Override // dl1.a0
    public final b0 b(m mVar) {
        b0<SearchTypeaheadItemFeed> f13;
        String str;
        k2 params = (k2) mVar;
        Intrinsics.checkNotNullParameter(params, "params");
        boolean z13 = this.f74541b;
        String str2 = z13 ? g.f74528g : g.f74524c;
        int i13 = h.f74538b[params.f131431c.ordinal()];
        b bVar = this.f74540a;
        if (i13 != 1) {
            String str3 = null;
            if (i13 == 2) {
                f13 = f(params, str2, z13, null);
            } else if (i13 == 3) {
                f13 = bVar.a(g.f74525d, dl2.b.c1(), n00.b.a(n00.c.BUBBLE_ARTICLE));
            } else if (i13 == 4) {
                String str4 = params.f131433e;
                Intrinsics.checkNotNullExpressionValue(str4, "getQuery(...)");
                f13 = this.f74540a.e(str4, str2, str2, true, n00.b.a(n00.c.SEARCH_PERSONAL_RETRIEVAL));
            } else {
                if (i13 != 5) {
                    throw new NoWhenBranchMatchedException();
                }
                a aVar = params.f131432d;
                int i14 = aVar == null ? -1 : h.f74537a[aVar.ordinal()];
                String str5 = params.f131433e;
                if (i14 == 1) {
                    Intrinsics.checkNotNullExpressionValue(str5, "getQuery(...)");
                    if (aVar == null) {
                        f13 = b0.g(new IllegalArgumentException("Cannot have a null Scope"));
                        Intrinsics.checkNotNullExpressionValue(f13, "error(...)");
                    } else {
                        int[] iArr = h.f74537a;
                        int i15 = iArr[aVar.ordinal()];
                        String str6 = ", user.followed_by_me";
                        if (i15 != 1) {
                            if (i15 == 2) {
                                str6 = ", user.first_name";
                            } else if (i15 != 6) {
                                str6 = "";
                            }
                        }
                        String concat = "user.website_url, user.location, user.domain_verified, user.verified_identity, board.section_count".concat(str6);
                        int i16 = iArr[aVar.ordinal()];
                        if (i16 == 1) {
                            str = "board";
                        } else if (i16 == 2) {
                            str = "mutual_follow, followee, facebook_pinner";
                        } else if (i16 != 4) {
                            str = i16 != 5 ? i16 != 6 ? i16 != 7 ? "board, board_suggestion, facebook_non_pinner, facebook_pinner, followee, mutual_follow, owner_and_commenter, pin_suggestion, twitter_non_pinner, twitter_pinner, recent_queries" : "recent_queries" : "facebook_pinner" : "facebook_pinner, second_degree_follower, second_degree_followee, mutual_follow, owner_and_commenter, pin_suggestion, twitter_pinner";
                        } else {
                            ArrayList H0 = CollectionsKt.H0(g.f74535n);
                            H0.addAll(g.f74536o);
                            str = CollectionsKt.Z(H0, ",", null, null, 0, null, null, 62);
                        }
                        int i17 = iArr[aVar.ordinal()];
                        if (i17 == 2) {
                            str3 = g.f74523b;
                        } else if (i17 == 4) {
                            str3 = g.f74523b;
                        } else if (i17 == 5) {
                            str3 = g.f74522a;
                        } else if (i17 == 6) {
                            str3 = g.f74523b;
                        }
                        f13 = bVar.l(str5, str, concat, str3);
                    }
                } else if (i14 == 2) {
                    Intrinsics.checkNotNullExpressionValue(str5, "getQuery(...)");
                    f13 = this.f74540a.d(str5, 6, "user.id,user.username,user.explicitly_followed_by_me,user.first_name,user.full_name,user.is_partner,user.image_medium_url,user.verified_identity,user.type", null, Boolean.valueOf(params.f131435g));
                } else if (i14 != 3) {
                    f13 = f(params, str2, z13, params.f131436h);
                } else {
                    Intrinsics.checkNotNullExpressionValue(str5, "getQuery(...)");
                    f13 = bVar.b(str5, params.f131434f);
                }
            }
        } else {
            f13 = bVar.f(g.f74532k, true, n00.b.a(n00.c.BUBBLE_ARTICLE));
        }
        kk2.m k13 = f13.k(new b22.f(10, new i(1, new e(params), e.class, "apply", "apply(Lcom/pinterest/feature/search/typeahead/model/SearchTypeaheadItemFeed;)Lcom/pinterest/feature/search/typeahead/model/SearchTypeaheadItemFeed;", 0)));
        Intrinsics.checkNotNullExpressionValue(k13, "map(...)");
        return k13;
    }

    @Override // dl1.a0
    public final uj2.l c(m mVar, s sVar) {
        k2 params = (k2) mVar;
        Intrinsics.checkNotNullParameter(params, "params");
        hk2.c cVar = new hk2.c(new j12.i(19), 1);
        Intrinsics.checkNotNullExpressionValue(cVar, "error(...)");
        return cVar;
    }

    @Override // dl1.a0
    public final b0 e(m mVar) {
        k2 params = (k2) mVar;
        Intrinsics.checkNotNullParameter(params, "params");
        kk2.k kVar = new kk2.k(new j12.i(20), 0);
        Intrinsics.checkNotNullExpressionValue(kVar, "error(...)");
        return kVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0132 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0104  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final uj2.b0 f(x02.k2 r18, java.lang.String r19, boolean r20, j22.l r21) {
        /*
            Method dump skipped, instructions count: 354
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: j22.j.f(x02.k2, java.lang.String, boolean, j22.l):uj2.b0");
    }
}
