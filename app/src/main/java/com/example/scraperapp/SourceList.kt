package com.example.scraperapp

object SourceList {
    fun getSources(): List<Source> {
        return listOf(
            Source("OAPEN", "www.oapen.org"),
            Source("DOAJ", "www.doaj.org"),
            Source("EconStor", "www.econstor.eu"),
            Source("RePEc", "www.repec.org"),
            Source("PubMed Central", "www.ncbi.nlm.nih.gov/pmc"),
            Source("Deutsche Nationalbibliothek", "www.dnb.de"),
            Source("Project Gutenberg", "www.gutenberg.org"),
            Source("Internet Archive", "www.archive.org"),
            Source("Google Scholar", "scholar.google.com"),
            Source("BASE", "www.base-search.net"),
            Source("EZB", "www.bibliothek.uni-regensburg.de/ezb"),
            Source("ZBW Open Economics Guide", "openeconomics.zbw.eu"),
            Source("arXiv", "www.arxiv.org"),
            Source("SSRN", "www.ssrn.com")
        )
    }
}
