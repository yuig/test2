package com.pinterest.creatorHub.feature.creatorpathways;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.pinterest.framework.screens.ScreenLocation;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import lb.l0;
import nx.f1;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Keep
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\u0081\u0002\u0018\u0000 \u00102\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002:\u0001\u0011B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\f\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\f\u0010\rj\u0002\b\u0012¨\u0006\u0013"}, d2 = {"Lcom/pinterest/creatorHub/feature/creatorpathways/CreatorPathwaysLocation;", "", "Lcom/pinterest/framework/screens/ScreenLocation;", "", "onScreenNavigation", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "<init>", "(Ljava/lang/String;I)V", "Companion", "com/pinterest/creatorHub/feature/creatorpathways/b", "CREATOR_PATHWAYS", "creatorPathways_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public abstract class CreatorPathwaysLocation implements ScreenLocation {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ CreatorPathwaysLocation[] $VALUES;

    @NotNull
    public static final Parcelable.Creator<CreatorPathwaysLocation> CREATOR;
    public static final CreatorPathwaysLocation CREATOR_PATHWAYS = new CreatorPathwaysLocation() { // from class: com.pinterest.creatorHub.feature.creatorpathways.CreatorPathwaysLocation.CREATOR_PATHWAYS

        /* renamed from: a, reason: collision with root package name */
        public final Class f44777a = f.class;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f44778b = true;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f44779c = true;

        @Override // com.pinterest.creatorHub.feature.creatorpathways.CreatorPathwaysLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getScreenClass, reason: from getter */
        public final Class getF44777a() {
            return this.f44777a;
        }

        @Override // com.pinterest.creatorHub.feature.creatorpathways.CreatorPathwaysLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getShouldKeepOldScreenVisible, reason: from getter */
        public final boolean getF44779c() {
            return this.f44779c;
        }

        @Override // com.pinterest.creatorHub.feature.creatorpathways.CreatorPathwaysLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getShouldShowMainNavigation */
        public final boolean getF45109b() {
            return false;
        }

        @Override // com.pinterest.creatorHub.feature.creatorpathways.CreatorPathwaysLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getShouldSkipTransitions, reason: from getter */
        public final boolean getF44778b() {
            return this.f44778b;
        }
    };

    @NotNull
    public static final b Companion;

    private static final /* synthetic */ CreatorPathwaysLocation[] $values() {
        return new CreatorPathwaysLocation[]{CREATOR_PATHWAYS};
    }

    static {
        CreatorPathwaysLocation[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
        Companion = new b();
        CREATOR = new f1(17);
    }

    public /* synthetic */ CreatorPathwaysLocation(String str, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i13);
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static CreatorPathwaysLocation valueOf(String str) {
        return (CreatorPathwaysLocation) Enum.valueOf(CreatorPathwaysLocation.class, str);
    }

    public static CreatorPathwaysLocation[] values() {
        return (CreatorPathwaysLocation[]) $VALUES.clone();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.pinterest.framework.screens.ScreenLocation
    @NotNull
    /* renamed from: getDisplayMode */
    public com.pinterest.framework.screens.g getF49770b() {
        return com.pinterest.framework.screens.g.DEFAULT;
    }

    @Override // com.pinterest.framework.screens.ScreenLocation
    @NotNull
    public kl1.a getEarlyAccessKey() {
        return kl1.a.LateAccessScreenKey;
    }

    @Override // com.pinterest.framework.screens.ScreenLocation
    public /* bridge */ /* synthetic */ String getName() {
        return name();
    }

    @Override // com.pinterest.framework.screens.ScreenLocation
    @NotNull
    /* renamed from: getScreenClass */
    public abstract /* synthetic */ Class getF44777a();

    @Override // com.pinterest.framework.screens.ScreenLocation
    /* renamed from: getShouldKeepOldScreenVisible */
    public /* bridge */ /* synthetic */ boolean getF44779c() {
        return false;
    }

    @Override // com.pinterest.framework.screens.ScreenLocation
    /* renamed from: getShouldNotActivateLastScreenVisible */
    public /* bridge */ /* synthetic */ boolean getF45113d() {
        return false;
    }

    @Override // com.pinterest.framework.screens.ScreenLocation
    /* renamed from: getShouldShowMainNavigation */
    public /* bridge */ /* synthetic */ boolean getF45109b() {
        return super.getF45109b();
    }

    @Override // com.pinterest.framework.screens.ScreenLocation
    /* renamed from: getShouldSkipTransitions */
    public /* bridge */ /* synthetic */ boolean getF44778b() {
        return false;
    }

    @Override // com.pinterest.framework.screens.ScreenLocation
    public /* bridge */ /* synthetic */ boolean getSupportsStateRestorationOnlyUseInEmergencies() {
        return true;
    }

    @Override // com.pinterest.framework.screens.ScreenLocation
    public void onScreenNavigation() {
    }

    @Override // com.pinterest.framework.screens.ScreenLocation, android.os.Parcelable
    public void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(name());
    }

    private CreatorPathwaysLocation(String str, int i13) {
    }
}
