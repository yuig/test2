package c71;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final /* synthetic */ class e extends kotlin.jvm.internal.p implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26759a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(Object obj, int i13) {
        super(1, obj, m.class, "addDataSources", "addDataSources(Lcom/pinterest/feature/core/presenter/DataSourceList;)V", 0);
        this.f26759a = i13;
        switch (i13) {
            case 1:
                super(1, obj, m.class, "convertToPlankModels", "convertToPlankModels(Ljava/util/List;)Ljava/util/List;", 0);
                break;
            case 2:
                super(1, obj, m.class, "extractEndCursor", "extractEndCursor(Lcom/apollographql/apollo3/api/ApolloResponse;)Ljava/lang/String;", 0);
                break;
            case 3:
                super(1, obj, m.class, "extractErrors", "extractErrors(Lcom/apollographql/apollo3/api/ApolloResponse;)Lcom/apollographql/apollo3/exception/ApolloException;", 0);
                break;
            case 4:
                super(1, obj, m.class, "extractHasNextPage", "extractHasNextPage(Lcom/apollographql/apollo3/api/ApolloResponse;)Z", 0);
                break;
            case 5:
                super(1, obj, m.class, "extractOneBarModules", "extractOneBarModules(Lcom/apollographql/apollo3/api/ApolloResponse;)Ljava/util/List;", 0);
                break;
            case 6:
                super(1, obj, m.class, "extractResponseItems", "extractResponseItems(Lcom/apollographql/apollo3/api/ApolloResponse;)Ljava/util/List;", 0);
                break;
            case 7:
                super(1, obj, m.class, "extractSensitivity", "extractSensitivity(Lcom/apollographql/apollo3/api/ApolloResponse;)Lcom/pinterest/api/model/Sensitivity;", 0);
                break;
            case 8:
                super(1, obj, m.class, "getNextQuery", "getNextQuery(Lcom/pinterest/framework/multisection/datasource/pagedlist/GraphQLPagedList$RequestState;)Lcom/apollographql/apollo3/api/Query;", 0);
                break;
            case 9:
                super(1, obj, m.class, "logSearchEvent", "logSearchEvent(Lcom/pinterest/feature/search/results/presenter/SearchParameters;)V", 0);
                break;
            case 10:
                super(1, obj, m.class, "parseResponse", "parseResponse(Lcom/apollographql/apollo3/api/ApolloResponse;)Lcom/pinterest/framework/multisection/datasource/pagedlist/GraphQLPagedList$ParsedResponse;", 0);
                break;
            case 11:
                super(1, obj, m.class, "getNextQuery", "getNextQuery(Lcom/pinterest/framework/multisection/datasource/pagedlist/GraphQLPagedList$RequestState;)Lcom/apollographql/apollo3/api/Query;", 0);
                break;
            case 12:
                super(1, obj, m.class, "parseResponse", "parseResponse(Lcom/apollographql/apollo3/api/ApolloResponse;)Lcom/pinterest/framework/multisection/datasource/pagedlist/GraphQLPagedList$ParsedResponse;", 0);
                break;
            default:
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f26759a;
        switch (i13) {
            case 0:
                vq0.a p03 = (vq0.a) obj;
                Intrinsics.checkNotNullParameter(p03, "p0");
                ((m) this.receiver).addDataSources(p03);
                return Unit.f80348a;
            case 1:
                List p04 = (List) obj;
                Intrinsics.checkNotNullParameter(p04, "p0");
                return ((m) this.receiver).convertToPlankModels(p04);
            case 2:
                pc.h p05 = (pc.h) obj;
                Intrinsics.checkNotNullParameter(p05, "p0");
                return ((m) this.receiver).x3(p05);
            case 3:
                pc.h p06 = (pc.h) obj;
                Intrinsics.checkNotNullParameter(p06, "p0");
                return ((m) this.receiver).z3(p06);
            case 4:
                pc.h p07 = (pc.h) obj;
                Intrinsics.checkNotNullParameter(p07, "p0");
                return Boolean.valueOf(((m) this.receiver).B3(p07));
            case 5:
                pc.h p08 = (pc.h) obj;
                switch (i13) {
                    case 5:
                        Intrinsics.checkNotNullParameter(p08, "p0");
                        return ((m) this.receiver).D3(p08);
                    default:
                        Intrinsics.checkNotNullParameter(p08, "p0");
                        return ((m) this.receiver).F3(p08);
                }
            case 6:
                pc.h p09 = (pc.h) obj;
                switch (i13) {
                    case 5:
                        Intrinsics.checkNotNullParameter(p09, "p0");
                        return ((m) this.receiver).D3(p09);
                    default:
                        Intrinsics.checkNotNullParameter(p09, "p0");
                        return ((m) this.receiver).F3(p09);
                }
            case 7:
                pc.h p010 = (pc.h) obj;
                Intrinsics.checkNotNullParameter(p010, "p0");
                return ((m) this.receiver).G3(p010);
            case 8:
                com.pinterest.framework.multisection.datasource.pagedlist.p p011 = (com.pinterest.framework.multisection.datasource.pagedlist.p) obj;
                switch (i13) {
                    case 8:
                        Intrinsics.checkNotNullParameter(p011, "p0");
                        return m.u3((m) this.receiver, p011);
                    default:
                        Intrinsics.checkNotNullParameter(p011, "p0");
                        return m.u3((m) this.receiver, p011);
                }
            case 9:
                b0 p012 = (b0) obj;
                Intrinsics.checkNotNullParameter(p012, "p0");
                ((m) this.receiver).K3(p012);
                return Unit.f80348a;
            case 10:
                pc.h p013 = (pc.h) obj;
                switch (i13) {
                    case 10:
                        Intrinsics.checkNotNullParameter(p013, "p0");
                        return m.v3((m) this.receiver, p013);
                    default:
                        Intrinsics.checkNotNullParameter(p013, "p0");
                        return m.v3((m) this.receiver, p013);
                }
            case 11:
                com.pinterest.framework.multisection.datasource.pagedlist.p p014 = (com.pinterest.framework.multisection.datasource.pagedlist.p) obj;
                switch (i13) {
                    case 8:
                        Intrinsics.checkNotNullParameter(p014, "p0");
                        return m.u3((m) this.receiver, p014);
                    default:
                        Intrinsics.checkNotNullParameter(p014, "p0");
                        return m.u3((m) this.receiver, p014);
                }
            default:
                pc.h p015 = (pc.h) obj;
                switch (i13) {
                    case 10:
                        Intrinsics.checkNotNullParameter(p015, "p0");
                        return m.v3((m) this.receiver, p015);
                    default:
                        Intrinsics.checkNotNullParameter(p015, "p0");
                        return m.v3((m) this.receiver, p015);
                }
        }
    }
}
