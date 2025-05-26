package com.pinterest.searchResults.framework.screens;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.pinterest.feature.search.results.view.GraphQLSearchGridFragment;
import com.pinterest.feature.search.results.view.SearchGridMultiSectionFragment;
import com.pinterest.framework.screens.ScreenLocation;
import com.pinterest.framework.screens.g;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l61.d;
import lb.l0;
import lh0.c2;
import n61.b;
import o61.c;
import org.jetbrains.annotations.NotNull;
import s61.e;
import uv1.l;
import uv1.q;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Keep
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0087\u0081\u0002\u0018\u0000 \u00142\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002:\u0001\u0015B\t\b\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\bH\u0016¢\u0006\u0004\b\f\u0010\rR\u0011\u0010\u0011\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001f¨\u0006 "}, d2 = {"Lcom/pinterest/searchResults/framework/screens/SearchResultsFeatureLocation;", "", "Lcom/pinterest/framework/screens/ScreenLocation;", "", "onScreenNavigation", "()V", "Landroid/os/Parcel;", "dest", "", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "Llh0/c2;", "getExperiments", "()Llh0/c2;", "experiments", "<init>", "(Ljava/lang/String;I)V", "Companion", "com/pinterest/searchResults/framework/screens/a", "SEARCH_GRID", "SEARCH_GRID_GRAPHQL", "STRUCTURED_GUIDE_BOTTOM_SHEET", "SEARCH_INCLUSIVE_FILTERS_BOTTOM_SHEET", "GOLD_STANDARD", "GOLD_STANDARD_STEPS", "GOLD_STANDARD_AUDIO_INTRO", "GOLD_STANDARD_AUDIO_PLAY", "GOLD_STANDARD_BOTTOM_SHEET", "SEARCH_RESULTS", "results_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public abstract class SearchResultsFeatureLocation implements ScreenLocation {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ SearchResultsFeatureLocation[] $VALUES;

    @NotNull
    public static final Parcelable.Creator<SearchResultsFeatureLocation> CREATOR;

    @NotNull
    public static final a Companion;
    public static final SearchResultsFeatureLocation SEARCH_GRID = new SearchResultsFeatureLocation() { // from class: com.pinterest.searchResults.framework.screens.SearchResultsFeatureLocation.SEARCH_GRID

        /* renamed from: a, reason: collision with root package name */
        public final Class f51717a = SearchGridMultiSectionFragment.class;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f51718b = true;

        @Override // com.pinterest.searchResults.framework.screens.SearchResultsFeatureLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getScreenClass, reason: from getter */
        public final Class getF51824a() {
            return this.f51717a;
        }

        @Override // com.pinterest.searchResults.framework.screens.SearchResultsFeatureLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getShouldSkipTransitions, reason: from getter */
        public final boolean getF51723b() {
            return this.f51718b;
        }
    };
    public static final SearchResultsFeatureLocation SEARCH_GRID_GRAPHQL = new SearchResultsFeatureLocation() { // from class: com.pinterest.searchResults.framework.screens.SearchResultsFeatureLocation.SEARCH_GRID_GRAPHQL

        /* renamed from: a, reason: collision with root package name */
        public final boolean f51719a = true;

        @Override // com.pinterest.searchResults.framework.screens.SearchResultsFeatureLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getScreenClass */
        public final Class getF51824a() {
            return GraphQLSearchGridFragment.class;
        }

        @Override // com.pinterest.searchResults.framework.screens.SearchResultsFeatureLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getShouldSkipTransitions, reason: from getter */
        public final boolean getF51723b() {
            return this.f51719a;
        }
    };
    public static final SearchResultsFeatureLocation STRUCTURED_GUIDE_BOTTOM_SHEET = new SearchResultsFeatureLocation() { // from class: com.pinterest.searchResults.framework.screens.SearchResultsFeatureLocation.STRUCTURED_GUIDE_BOTTOM_SHEET

        /* renamed from: a, reason: collision with root package name */
        public final Class f51724a = q.class;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f51725b = true;

        @Override // com.pinterest.searchResults.framework.screens.SearchResultsFeatureLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getScreenClass, reason: from getter */
        public final Class getF51824a() {
            return this.f51724a;
        }

        @Override // com.pinterest.searchResults.framework.screens.SearchResultsFeatureLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getShouldKeepOldScreenVisible, reason: from getter */
        public final boolean getF51825b() {
            return this.f51725b;
        }

        @Override // com.pinterest.searchResults.framework.screens.SearchResultsFeatureLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getShouldNotActivateLastScreenVisible */
        public final boolean getF51715d() {
            return false;
        }

        @Override // com.pinterest.searchResults.framework.screens.SearchResultsFeatureLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getShouldShowMainNavigation */
        public final boolean getF49203a() {
            return false;
        }
    };
    public static final SearchResultsFeatureLocation SEARCH_INCLUSIVE_FILTERS_BOTTOM_SHEET = new SearchResultsFeatureLocation() { // from class: com.pinterest.searchResults.framework.screens.SearchResultsFeatureLocation.SEARCH_INCLUSIVE_FILTERS_BOTTOM_SHEET

        /* renamed from: a, reason: collision with root package name */
        public final Class f51720a = l.class;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f51721b = true;

        @Override // com.pinterest.searchResults.framework.screens.SearchResultsFeatureLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getScreenClass, reason: from getter */
        public final Class getF51824a() {
            return this.f51720a;
        }

        @Override // com.pinterest.searchResults.framework.screens.SearchResultsFeatureLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getShouldKeepOldScreenVisible, reason: from getter */
        public final boolean getF51825b() {
            return this.f51721b;
        }

        @Override // com.pinterest.searchResults.framework.screens.SearchResultsFeatureLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getShouldNotActivateLastScreenVisible */
        public final boolean getF51715d() {
            return false;
        }

        @Override // com.pinterest.searchResults.framework.screens.SearchResultsFeatureLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getShouldShowMainNavigation */
        public final boolean getF49203a() {
            return false;
        }
    };
    public static final SearchResultsFeatureLocation GOLD_STANDARD = new SearchResultsFeatureLocation() { // from class: com.pinterest.searchResults.framework.screens.SearchResultsFeatureLocation.GOLD_STANDARD

        /* renamed from: a, reason: collision with root package name */
        public final Class f51709a = d.class;

        @Override // com.pinterest.searchResults.framework.screens.SearchResultsFeatureLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getScreenClass, reason: from getter */
        public final Class getF51824a() {
            return this.f51709a;
        }

        @Override // com.pinterest.searchResults.framework.screens.SearchResultsFeatureLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getShouldShowMainNavigation */
        public final boolean getF49203a() {
            return false;
        }
    };
    public static final SearchResultsFeatureLocation GOLD_STANDARD_STEPS = new SearchResultsFeatureLocation() { // from class: com.pinterest.searchResults.framework.screens.SearchResultsFeatureLocation.GOLD_STANDARD_STEPS

        /* renamed from: a, reason: collision with root package name */
        public final Class f51716a = e.class;

        @Override // com.pinterest.searchResults.framework.screens.SearchResultsFeatureLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getScreenClass, reason: from getter */
        public final Class getF51824a() {
            return this.f51716a;
        }

        @Override // com.pinterest.searchResults.framework.screens.SearchResultsFeatureLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getShouldShowMainNavigation */
        public final boolean getF49203a() {
            return false;
        }
    };
    public static final SearchResultsFeatureLocation GOLD_STANDARD_AUDIO_INTRO = new SearchResultsFeatureLocation() { // from class: com.pinterest.searchResults.framework.screens.SearchResultsFeatureLocation.GOLD_STANDARD_AUDIO_INTRO

        /* renamed from: a, reason: collision with root package name */
        public final Class f51710a = b.class;

        @Override // com.pinterest.searchResults.framework.screens.SearchResultsFeatureLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getScreenClass, reason: from getter */
        public final Class getF51824a() {
            return this.f51710a;
        }

        @Override // com.pinterest.searchResults.framework.screens.SearchResultsFeatureLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getShouldShowMainNavigation */
        public final boolean getF49203a() {
            return false;
        }
    };
    public static final SearchResultsFeatureLocation GOLD_STANDARD_AUDIO_PLAY = new SearchResultsFeatureLocation() { // from class: com.pinterest.searchResults.framework.screens.SearchResultsFeatureLocation.GOLD_STANDARD_AUDIO_PLAY

        /* renamed from: a, reason: collision with root package name */
        public final Class f51711a = c.class;

        @Override // com.pinterest.searchResults.framework.screens.SearchResultsFeatureLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getScreenClass, reason: from getter */
        public final Class getF51824a() {
            return this.f51711a;
        }

        @Override // com.pinterest.searchResults.framework.screens.SearchResultsFeatureLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getShouldShowMainNavigation */
        public final boolean getF49203a() {
            return false;
        }
    };
    public static final SearchResultsFeatureLocation GOLD_STANDARD_BOTTOM_SHEET = new SearchResultsFeatureLocation() { // from class: com.pinterest.searchResults.framework.screens.SearchResultsFeatureLocation.GOLD_STANDARD_BOTTOM_SHEET

        /* renamed from: a, reason: collision with root package name */
        public final Class f51712a = p61.d.class;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f51713b = true;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f51714c = true;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f51715d = true;

        @Override // com.pinterest.searchResults.framework.screens.SearchResultsFeatureLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getScreenClass, reason: from getter */
        public final Class getF51824a() {
            return this.f51712a;
        }

        @Override // com.pinterest.searchResults.framework.screens.SearchResultsFeatureLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getShouldKeepOldScreenVisible, reason: from getter */
        public final boolean getF51825b() {
            return this.f51714c;
        }

        @Override // com.pinterest.searchResults.framework.screens.SearchResultsFeatureLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getShouldNotActivateLastScreenVisible, reason: from getter */
        public final boolean getF51715d() {
            return this.f51715d;
        }

        @Override // com.pinterest.searchResults.framework.screens.SearchResultsFeatureLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getShouldShowMainNavigation */
        public final boolean getF49203a() {
            return false;
        }

        @Override // com.pinterest.searchResults.framework.screens.SearchResultsFeatureLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getShouldSkipTransitions, reason: from getter */
        public final boolean getF51723b() {
            return this.f51713b;
        }
    };
    public static final SearchResultsFeatureLocation SEARCH_RESULTS = new SearchResultsFeatureLocation() { // from class: com.pinterest.searchResults.framework.screens.SearchResultsFeatureLocation.SEARCH_RESULTS

        /* renamed from: a, reason: collision with root package name */
        public final Class f51722a = SearchGridMultiSectionFragment.class;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f51723b = true;

        @Override // com.pinterest.searchResults.framework.screens.SearchResultsFeatureLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getScreenClass, reason: from getter */
        public final Class getF51824a() {
            return this.f51722a;
        }

        @Override // com.pinterest.searchResults.framework.screens.SearchResultsFeatureLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getShouldSkipTransitions, reason: from getter */
        public final boolean getF51723b() {
            return this.f51723b;
        }
    };

    private static final /* synthetic */ SearchResultsFeatureLocation[] $values() {
        return new SearchResultsFeatureLocation[]{SEARCH_GRID, SEARCH_GRID_GRAPHQL, STRUCTURED_GUIDE_BOTTOM_SHEET, SEARCH_INCLUSIVE_FILTERS_BOTTOM_SHEET, GOLD_STANDARD, GOLD_STANDARD_STEPS, GOLD_STANDARD_AUDIO_INTRO, GOLD_STANDARD_AUDIO_PLAY, GOLD_STANDARD_BOTTOM_SHEET, SEARCH_RESULTS};
    }

    static {
        SearchResultsFeatureLocation[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
        Companion = new a();
        CREATOR = new com.pinterest.feature.todaytab.a(18);
    }

    public /* synthetic */ SearchResultsFeatureLocation(String str, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i13);
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static SearchResultsFeatureLocation valueOf(String str) {
        return (SearchResultsFeatureLocation) Enum.valueOf(SearchResultsFeatureLocation.class, str);
    }

    public static SearchResultsFeatureLocation[] values() {
        return (SearchResultsFeatureLocation[]) $VALUES.clone();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.pinterest.framework.screens.ScreenLocation
    @NotNull
    /* renamed from: getDisplayMode */
    public g getF51815b() {
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
    public abstract /* synthetic */ Class getF51824a();

    @Override // com.pinterest.framework.screens.ScreenLocation
    /* renamed from: getShouldKeepOldScreenVisible */
    public /* bridge */ /* synthetic */ boolean getF51825b() {
        return false;
    }

    @Override // com.pinterest.framework.screens.ScreenLocation
    /* renamed from: getShouldNotActivateLastScreenVisible */
    public /* bridge */ /* synthetic */ boolean getF51715d() {
        return false;
    }

    @Override // com.pinterest.framework.screens.ScreenLocation
    /* renamed from: getShouldShowMainNavigation */
    public /* bridge */ /* synthetic */ boolean getF49203a() {
        return super.getF49203a();
    }

    @Override // com.pinterest.framework.screens.ScreenLocation
    /* renamed from: getShouldSkipTransitions */
    public /* bridge */ /* synthetic */ boolean getF51723b() {
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

    private SearchResultsFeatureLocation(String str, int i13) {
    }
}
