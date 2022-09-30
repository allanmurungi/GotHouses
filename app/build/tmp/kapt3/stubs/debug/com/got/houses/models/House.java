package com.got.houses.models;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b4\u0018\u00002\u00020\u0001B\u00ed\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u000b\u0012\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u000b\u0012\u0010\b\u0002\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u000b\u0012\u0010\b\u0002\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u000b\u00a2\u0006\u0002\u0010\u0016R\"\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\"\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0018\"\u0004\b\u001c\u0010\u001aR\u001c\u0010\b\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001c\u0010\r\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u001e\"\u0004\b\"\u0010 R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u001e\"\u0004\b$\u0010 R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u001e\"\u0004\b&\u0010 R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\'\u0010\u001e\"\u0004\b(\u0010 R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\u001e\"\u0004\b*\u0010 R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b/\u0010\u001e\"\u0004\b0\u0010 R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b1\u0010\u001e\"\u0004\b2\u0010 R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b3\u0010\u001e\"\u0004\b4\u0010 R\"\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b5\u0010\u0018\"\u0004\b6\u0010\u001aR\"\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b7\u0010\u0018\"\u0004\b8\u0010\u001aR\"\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b9\u0010\u0018\"\u0004\b:\u0010\u001aR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b;\u0010\u001e\"\u0004\b<\u0010 R\u001c\u0010\t\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b=\u0010\u001e\"\u0004\b>\u0010 \u00a8\u0006?"}, d2 = {"Lcom/got/houses/models/House;", "", "id", "", "url", "", "name", "region", "coatOfArms", "words", "titles", "", "seats", "currentLord", "heir", "overLord", "founded", "founder", "diedOut", "ancestralWeapons", "cardetBranches", "swornMembers", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "getAncestralWeapons", "()Ljava/util/List;", "setAncestralWeapons", "(Ljava/util/List;)V", "getCardetBranches", "setCardetBranches", "getCoatOfArms", "()Ljava/lang/String;", "setCoatOfArms", "(Ljava/lang/String;)V", "getCurrentLord", "setCurrentLord", "getDiedOut", "setDiedOut", "getFounded", "setFounded", "getFounder", "setFounder", "getHeir", "setHeir", "getId", "()I", "setId", "(I)V", "getName", "setName", "getOverLord", "setOverLord", "getRegion", "setRegion", "getSeats", "setSeats", "getSwornMembers", "setSwornMembers", "getTitles", "setTitles", "getUrl", "setUrl", "getWords", "setWords", "app_debug"})
public final class House {
    private int id;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String url;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String name;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String region;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String coatOfArms;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String words;
    @org.jetbrains.annotations.Nullable()
    private java.util.List<java.lang.String> titles;
    @org.jetbrains.annotations.Nullable()
    private java.util.List<java.lang.String> seats;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String currentLord;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String heir;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String overLord;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String founded;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String founder;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String diedOut;
    @org.jetbrains.annotations.Nullable()
    private java.util.List<java.lang.String> ancestralWeapons;
    @org.jetbrains.annotations.Nullable()
    private java.util.List<java.lang.String> cardetBranches;
    @org.jetbrains.annotations.Nullable()
    private java.util.List<java.lang.String> swornMembers;
    
    public House() {
        super();
    }
    
    public House(int id, @org.jetbrains.annotations.Nullable()
    java.lang.String url, @org.jetbrains.annotations.Nullable()
    java.lang.String name, @org.jetbrains.annotations.Nullable()
    java.lang.String region, @org.jetbrains.annotations.Nullable()
    java.lang.String coatOfArms, @org.jetbrains.annotations.Nullable()
    java.lang.String words, @org.jetbrains.annotations.Nullable()
    java.util.List<java.lang.String> titles, @org.jetbrains.annotations.Nullable()
    java.util.List<java.lang.String> seats, @org.jetbrains.annotations.Nullable()
    java.lang.String currentLord, @org.jetbrains.annotations.Nullable()
    java.lang.String heir, @org.jetbrains.annotations.Nullable()
    java.lang.String overLord, @org.jetbrains.annotations.Nullable()
    java.lang.String founded, @org.jetbrains.annotations.Nullable()
    java.lang.String founder, @org.jetbrains.annotations.Nullable()
    java.lang.String diedOut, @org.jetbrains.annotations.Nullable()
    java.util.List<java.lang.String> ancestralWeapons, @org.jetbrains.annotations.Nullable()
    java.util.List<java.lang.String> cardetBranches, @org.jetbrains.annotations.Nullable()
    java.util.List<java.lang.String> swornMembers) {
        super();
    }
    
    public final int getId() {
        return 0;
    }
    
    public final void setId(int p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getUrl() {
        return null;
    }
    
    public final void setUrl(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getName() {
        return null;
    }
    
    public final void setName(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getRegion() {
        return null;
    }
    
    public final void setRegion(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getCoatOfArms() {
        return null;
    }
    
    public final void setCoatOfArms(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getWords() {
        return null;
    }
    
    public final void setWords(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<java.lang.String> getTitles() {
        return null;
    }
    
    public final void setTitles(@org.jetbrains.annotations.Nullable()
    java.util.List<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<java.lang.String> getSeats() {
        return null;
    }
    
    public final void setSeats(@org.jetbrains.annotations.Nullable()
    java.util.List<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getCurrentLord() {
        return null;
    }
    
    public final void setCurrentLord(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getHeir() {
        return null;
    }
    
    public final void setHeir(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getOverLord() {
        return null;
    }
    
    public final void setOverLord(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getFounded() {
        return null;
    }
    
    public final void setFounded(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getFounder() {
        return null;
    }
    
    public final void setFounder(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getDiedOut() {
        return null;
    }
    
    public final void setDiedOut(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<java.lang.String> getAncestralWeapons() {
        return null;
    }
    
    public final void setAncestralWeapons(@org.jetbrains.annotations.Nullable()
    java.util.List<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<java.lang.String> getCardetBranches() {
        return null;
    }
    
    public final void setCardetBranches(@org.jetbrains.annotations.Nullable()
    java.util.List<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<java.lang.String> getSwornMembers() {
        return null;
    }
    
    public final void setSwornMembers(@org.jetbrains.annotations.Nullable()
    java.util.List<java.lang.String> p0) {
    }
}