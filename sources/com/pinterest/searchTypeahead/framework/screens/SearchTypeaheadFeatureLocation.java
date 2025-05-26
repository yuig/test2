package com.pinterest.searchTypeahead.framework.screens;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.pinterest.framework.screens.ScreenLocation;
import com.pinterest.framework.screens.g;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import lb.l0;
import lh0.c2;
import org.jetbrains.annotations.NotNull;
import q71.a1;
import q71.d;
import q71.g0;
import q71.v0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Keep
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\b\u0087\u0081\u0002\u0018\u0000 \u00142\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002:\u0001\u0015B\t\b\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\bH\u0016¢\u0006\u0004\b\f\u0010\rR\u0011\u0010\u0011\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001a¨\u0006\u001b"}, d2 = {"Lcom/pinterest/searchTypeahead/framework/screens/SearchTypeaheadFeatureLocation;", "", "Lcom/pinterest/framework/screens/ScreenLocation;", "", "onScreenNavigation", "()V", "Landroid/os/Parcel;", "dest", "", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "Llh0/c2;", "getExperiments", "()Llh0/c2;", "experiments", "<init>", "(Ljava/lang/String;I)V", "Companion", "com/pinterest/searchTypeahead/framework/screens/a", "SEARCH_TYPEAHEAD_TOP", "SEARCH_TYPEAHEAD_YOURS", "SEARCH_TYPEAHEAD_PRODUCTS", "COLLAGE_TYPEAHEAD", "CUTOUT_SEARCH_TYPEAHEAD", "typeahead_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public abstract class SearchTypeaheadFeatureLocation implements ScreenLocation {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ SearchTypeaheadFeatureLocation[] $VALUES;

    @NotNull
    public static final Parcelable.Creator<SearchTypeaheadFeatureLocation> CREATOR;

    @NotNull
    public static final a Companion;
    public static final SearchTypeaheadFeatureLocation SEARCH_TYPEAHEAD_TOP = new SearchTypeaheadFeatureLocation() { // from class: com.pinterest.searchTypeahead.framework.screens.SearchTypeaheadFeatureLocation.SEARCH_TYPEAHEAD_TOP

        /* renamed from: a, reason: collision with root package name */
        public final Class f51732a = v0.class;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f51733b = true;

        @Override // com.pinterest.searchTypeahead.framework.screens.SearchTypeaheadFeatureLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getScreenClass, reason: from getter */
        public final Class getF51734a() {
            return this.f51732a;
        }

        @Override // com.pinterest.searchTypeahead.framework.screens.SearchTypeaheadFeatureLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getShouldSkipTransitions, reason: from getter */
        public final boolean getF51735b() {
            return this.f51733b;
        }
    };
    public static final SearchTypeaheadFeatureLocation SEARCH_TYPEAHEAD_YOURS = new SearchTypeaheadFeatureLocation() { // from class: com.pinterest.searchTypeahead.framework.screens.SearchTypeaheadFeatureLocation.SEARCH_TYPEAHEAD_YOURS

        /* renamed from: a, reason: collision with root package name */
        public final Class f51734a = a1.class;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f51735b = true;

        @Override // com.pinterest.searchTypeahead.framework.screens.SearchTypeaheadFeatureLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getScreenClass, reason: from getter */
        public final Class getF51734a() {
            return this.f51734a;
        }

        @Override // com.pinterest.searchTypeahead.framework.screens.SearchTypeaheadFeatureLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getShouldSkipTransitions, reason: from getter */
        public final boolean getF51735b() {
            return this.f51735b;
        }
    };
    public static final SearchTypeaheadFeatureLocation SEARCH_TYPEAHEAD_PRODUCTS = new SearchTypeaheadFeatureLocation() { // from class: com.pinterest.searchTypeahead.framework.screens.SearchTypeaheadFeatureLocation.SEARCH_TYPEAHEAD_PRODUCTS

        /* renamed from: a, reason: collision with root package name */
        public final Class f51730a = g0.class;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f51731b = true;

        @Override // com.pinterest.searchTypeahead.framework.screens.SearchTypeaheadFeatureLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getScreenClass, reason: from getter */
        public final Class getF51734a() {
            return this.f51730a;
        }

        @Override // com.pinterest.searchTypeahead.framework.screens.SearchTypeaheadFeatureLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getShouldSkipTransitions, reason: from getter */
        public final boolean getF51735b() {
            return this.f51731b;
        }
    };
    public static final SearchTypeaheadFeatureLocation COLLAGE_TYPEAHEAD = new SearchTypeaheadFeatureLocation() { // from class: com.pinterest.searchTypeahead.framework.screens.SearchTypeaheadFeatureLocation.COLLAGE_TYPEAHEAD

        /* renamed from: a, reason: collision with root package name */
        public final Class f51726a = q71.a.class;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f51727b = true;

        @Override // com.pinterest.searchTypeahead.framework.screens.SearchTypeaheadFeatureLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getScreenClass, reason: from getter */
        public final Class getF51734a() {
            return this.f51726a;
        }

        @Override // com.pinterest.searchTypeahead.framework.screens.SearchTypeaheadFeatureLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getShouldSkipTransitions, reason: from getter */
        public final boolean getF51735b() {
            return this.f51727b;
        }
    };
    public static final SearchTypeaheadFeatureLocation CUTOUT_SEARCH_TYPEAHEAD = new SearchTypeaheadFeatureLocation() { // from class: com.pinterest.searchTypeahead.framework.screens.SearchTypeaheadFeatureLocation.CUTOUT_SEARCH_TYPEAHEAD

        /* renamed from: a, reason: collision with root package name */
        public final Class f51728a = d.class;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f51729b = true;

        @Override // com.pinterest.searchTypeahead.framework.screens.SearchTypeaheadFeatureLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getScreenClass, reason: from getter */
        public final Class getF51734a() {
            return this.f51728a;
        }

        @Override // com.pinterest.searchTypeahead.framework.screens.SearchTypeaheadFeatureLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getShouldSkipTransitions, reason: from getter */
        public final boolean getF51735b() {
            return this.f51729b;
        }
    };

    private static final /* synthetic */ SearchTypeaheadFeatureLocation[] $values() {
        return new SearchTypeaheadFeatureLocation[]{SEARCH_TYPEAHEAD_TOP, SEARCH_TYPEAHEAD_YOURS, SEARCH_TYPEAHEAD_PRODUCTS, COLLAGE_TYPEAHEAD, CUTOUT_SEARCH_TYPEAHEAD};
    }

    static {
        SearchTypeaheadFeatureLocation[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
        Companion = new a();
        CREATOR = new com.pinterest.feature.todaytab.a(19);
    }

    public /* synthetic */ SearchTypeaheadFeatureLocation(String str, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i13);
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static SearchTypeaheadFeatureLocation valueOf(String str) {
        return (SearchTypeaheadFeatureLocation) Enum.valueOf(SearchTypeaheadFeatureLocation.class, str);
    }

    public static SearchTypeaheadFeatureLocation[] values() {
        return (SearchTypeaheadFeatureLocation[]) $VALUES.clone();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.pinterest.framework.screens.ScreenLocation
    @NotNull
    /* renamed from: getDisplayMode */
    public g getF49743b() {
        return g.DEFAULT;
    }

    @Override // com.pinterest.framework.screens.ScreenLocation
    @NotNull
    public kl1.a getEarlyAccessKey() {
        return kl1.a.LateAccessScreenKey;
    }

    @NotNull
    public final c2 getExperiments() {
        return c2.f83314b.c();
    }

    @Override // com.pinterest.framework.screens.ScreenLocation
    public /* bridge */ /* synthetic */ String getName() {
        return name();
    }

    @Override // com.pinterest.framework.screens.ScreenLocation
    @NotNull
    /* renamed from: getScreenClass */
    public abstract /* synthetic */ Class getF51734a();

    @Override // com.pinterest.framework.screens.ScreenLocation
    /* renamed from: getShouldKeepOldScreenVisible */
    public /* bridge */ /* synthetic */ boolean getF49752b() {
        return false;
    }

    @Override // com.pinterest.framework.screens.ScreenLocation
    /* renamed from: getShouldNotActivateLastScreenVisible */
    public /* bridge */ /* synthetic */ boolean getF49753c() {
        return false;
    }

    @Override // com.pinterest.framework.screens.ScreenLocation
    /* renamed from: getShouldShowMainNavigation */
    public /* bridge */ /* synthetic */ boolean getF45109b() {
        return super.getF45109b();
    }

    @Override // com.pinterest.framework.screens.ScreenLocation
    /* renamed from: getShouldSkipTransitions */
    public /* bridge */ /* synthetic */ boolean getF51735b() {
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

    private SearchTypeaheadFeatureLocation(String str, int i13) {
    }
}
