package com.pinterest.oneBarLibrary.container.presenter;

import a.a;
import a.cb;
import com.pinterest.analytics.kibana.e;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import om.b;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000.\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010\u0003\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0005\u0010\u0004J\u0010\u0010\u0007\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\u0004J:\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u00062\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0004J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00062\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u001a\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0019\u001a\u0004\b\u001a\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0019\u001a\u0004\b\u001b\u0010\u0004R\u001a\u0010\f\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u001c\u001a\u0004\b\u001d\u0010\bR\u001c\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0019\u001a\u0004\b\u001e\u0010\u0004¨\u0006!"}, d2 = {"com/pinterest/oneBarLibrary/container/presenter/ModuleAutoClickEvent$Payload", "Lcom/pinterest/analytics/kibana/e;", "", "component1", "()Ljava/lang/String;", "component2", "", "component3", "()Z", "component4", "searchQuery", "moduleName", "moduleFound", "backupModuleChosen", "Lcom/pinterest/oneBarLibrary/container/presenter/ModuleAutoClickEvent$Payload;", "copy", "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)Lcom/pinterest/oneBarLibrary/container/presenter/ModuleAutoClickEvent$Payload;", "toString", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getSearchQuery", "getModuleName", "Z", "getModuleFound", "getBackupModuleChosen", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V", "oneBarLibrary_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final /* data */ class ModuleAutoClickEvent$Payload implements e {

    @b("backup_module_chosen")
    private final String backupModuleChosen;

    @b("module_found")
    private final boolean moduleFound;

    @b("module_name")
    @NotNull
    private final String moduleName;

    @b("search_query")
    @NotNull
    private final String searchQuery;

    public ModuleAutoClickEvent$Payload(@NotNull String searchQuery, @NotNull String moduleName, boolean z13, String str) {
        Intrinsics.checkNotNullParameter(searchQuery, "searchQuery");
        Intrinsics.checkNotNullParameter(moduleName, "moduleName");
        this.searchQuery = searchQuery;
        this.moduleName = moduleName;
        this.moduleFound = z13;
        this.backupModuleChosen = str;
    }

    public static /* synthetic */ ModuleAutoClickEvent$Payload copy$default(ModuleAutoClickEvent$Payload moduleAutoClickEvent$Payload, String str, String str2, boolean z13, String str3, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = moduleAutoClickEvent$Payload.searchQuery;
        }
        if ((i13 & 2) != 0) {
            str2 = moduleAutoClickEvent$Payload.moduleName;
        }
        if ((i13 & 4) != 0) {
            z13 = moduleAutoClickEvent$Payload.moduleFound;
        }
        if ((i13 & 8) != 0) {
            str3 = moduleAutoClickEvent$Payload.backupModuleChosen;
        }
        return moduleAutoClickEvent$Payload.copy(str, str2, z13, str3);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getSearchQuery() {
        return this.searchQuery;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getModuleName() {
        return this.moduleName;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getModuleFound() {
        return this.moduleFound;
    }

    /* renamed from: component4, reason: from getter */
    public final String getBackupModuleChosen() {
        return this.backupModuleChosen;
    }

    @NotNull
    public final ModuleAutoClickEvent$Payload copy(@NotNull String searchQuery, @NotNull String moduleName, boolean moduleFound, String backupModuleChosen) {
        Intrinsics.checkNotNullParameter(searchQuery, "searchQuery");
        Intrinsics.checkNotNullParameter(moduleName, "moduleName");
        return new ModuleAutoClickEvent$Payload(searchQuery, moduleName, moduleFound, backupModuleChosen);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ModuleAutoClickEvent$Payload)) {
            return false;
        }
        ModuleAutoClickEvent$Payload moduleAutoClickEvent$Payload = (ModuleAutoClickEvent$Payload) other;
        return Intrinsics.d(this.searchQuery, moduleAutoClickEvent$Payload.searchQuery) && Intrinsics.d(this.moduleName, moduleAutoClickEvent$Payload.moduleName) && this.moduleFound == moduleAutoClickEvent$Payload.moduleFound && Intrinsics.d(this.backupModuleChosen, moduleAutoClickEvent$Payload.backupModuleChosen);
    }

    public final String getBackupModuleChosen() {
        return this.backupModuleChosen;
    }

    public final boolean getModuleFound() {
        return this.moduleFound;
    }

    @NotNull
    public final String getModuleName() {
        return this.moduleName;
    }

    @NotNull
    public final String getSearchQuery() {
        return this.searchQuery;
    }

    public int hashCode() {
        int e13 = ep.b.e(this.moduleFound, cb.d(this.moduleName, this.searchQuery.hashCode() * 31, 31), 31);
        String str = this.backupModuleChosen;
        return e13 + (str == null ? 0 : str.hashCode());
    }

    @NotNull
    public String toString() {
        String str = this.searchQuery;
        String str2 = this.moduleName;
        boolean z13 = this.moduleFound;
        String str3 = this.backupModuleChosen;
        StringBuilder w13 = a.w("Payload(searchQuery=", str, ", moduleName=", str2, ", moduleFound=");
        w13.append(z13);
        w13.append(", backupModuleChosen=");
        w13.append(str3);
        w13.append(")");
        return w13.toString();
    }
}
